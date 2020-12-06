package characters;

import enums.*;
import interfaces.IdentificationStrategy;
import interfaces.iFlyable;
import materialObjects.Furniture;
import placesPackage.APlace;

import java.util.ArrayList;
import java.util.Objects;

public class MainHero extends Human implements iFlyable {
    private double currentCoordinat = 0;
    private double speed;
    private APlace place;

    public MainHero(String name, int age, Sex sex, double speed, APlace place, IdentificationStrategy IStrategy) {
        super(name, age, sex, IStrategy);
        this.speed = speed;
        this.place = place;
    }

    @Override
    public void Fly() {
        this.currentCoordinat += this.speed;
        if (this.currentCoordinat >= this.place.getDeep()) {
            System.out.println("Алиса достигла дна " + place.getTypePlace().toString() + " и открыла волшебную дверь");
        } else {
            System.out.println(super.getName() + " летит со скоростью " + this.speed + " м/с. Место: " + place.getTypePlace().toString());
            System.out.println("Текущая координата: " + this.currentCoordinat);
        }
    }

    @Override
    public void Look(Direction dir) {
        if (this.currentCoordinat < this.place.getDeep())
        System.out.println(super.getName() + " посмотрела " + dir.toString());
    }


    @Override
    public ArrayList<Furniture> Identificate(Direction dir) {
        return IStrategy.Identificate(dir, place, this.currentCoordinat);
    }

    public double getCurrentCoordinat() {
        return this.currentCoordinat;
    }

    public double getSpeed() {
        return this.speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MainHero other = (MainHero) o;
        return Double.compare(other.currentCoordinat, currentCoordinat) == 0 &&
                Double.compare(other.speed, speed) == 0 &&
                Objects.equals(place, other.place) &&
                Objects.equals(IStrategy, other.IStrategy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), currentCoordinat, speed, place, IStrategy);
    }
}
