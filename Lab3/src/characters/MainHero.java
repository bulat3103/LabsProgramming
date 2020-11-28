package characters;

import enums.*;
import interfaces.IdentificationStrategy;
import interfaces.iFlyable;
import materialObjects.Furniture;
import placesPackage.APlace;

public class MainHero extends Human implements iFlyable {
    private double currentCoordinat = 0;
    private double speed;
    private APlace place;
    private IdentificationStrategy IStrategy;

    public MainHero(String name, int age, Sex sex, double speed, APlace place, IdentificationStrategy IStrategy) {
        super(name, age, sex);
        this.speed = speed;
        this.place = place;
        this.IStrategy = IStrategy;
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
    public void Say(String message) {
        System.out.println(message);
    }

    public void Identificate(Direction dir) {
        if (this.speed > 5.0) Say("Слишком большая скорость. Ничего не могу разглядеть");
        if (this.currentCoordinat >= this.place.getDeep()) return;
        Say(IStrategy.Identificate(dir, this.place.getFurn(), this.currentCoordinat));
    }

    public double getCurrentCoordinat() {
        return this.currentCoordinat;
    }

    public double getSpeed() {
        return this.speed;
    }

    public void setIStrategy(IdentificationStrategy iStrategy) {
        this.IStrategy = iStrategy;
    }
}
