package characters;

import enums.*;
import interfaces.iFlyable;
import materialObjects.Furniture;
import materialObjects.Pit;

public class MainHero extends Human implements iFlyable {
    private double currentCoordinat = 0;
    private double speed;
    private Pit pit;

    public MainHero() {
        super();
        this.speed = 1;
    }

    public MainHero(String name, int age, Sex sex, double speed) {
        super(name, age, sex);
        this.speed = speed;
    }

    public void setPit(Pit pit) {
        this.pit = pit;
    }

    @Override
    public void Fly() {
        this.currentCoordinat += this.speed;
        if (this.currentCoordinat >= this.pit.getDeep()) {
            System.out.println("Алиса достигла дна колодца и открыла волшебную дверь");
        } else {
            System.out.println(super.getName() + " летит со скоростью " + this.speed + " м/с. Место: колодец");
            System.out.println("Текущая координата: " + this.currentCoordinat);
        }
    }

    @Override
    public void Look(Direction dir) {
        if (this.currentCoordinat < this.pit.getDeep())
        System.out.println(super.getName() + " посмотрела " + dir.toString());
    }

    @Override
    public void Say(String message) {
        System.out.println(message);
    }

    public void TryToSee(Direction dir) {
        if (this.currentCoordinat >= this.pit.getDeep()) return;
        if (dir == Direction.DOWN) {
            if (this.currentCoordinat < this.pit.getDeep() - 3) {
                Say("Ничего не видно, слишком темно");
            } else {
                Say("Я увидела волшебную дверь. Урааа!!!");
            }
            return;
        }
        if (dir == Direction.UP) {
            Say("Я вижу выход, но не тот :)");
            return;
        }
        if (this.speed > 5.0) {
            Say("Слишком большая скорость, ничего не могу разглядеть.");
            return;
        }
        String message = "Я ничего не вижу, там ничего нет.";
        for (Furniture e : this.pit.getFurn()) {
            if (e.getDir().toString().equals(dir.toString()) && e.getDeepCoordinat() == (int) this.currentCoordinat) {
                message = "Я вижу " + e.getType().toString();
            }
        }
        Say(message);
    }

    public double getCurrentCoordinat() {
        return this.currentCoordinat;
    }

    public double getSpeed() {
        return this.speed;
    }
}
