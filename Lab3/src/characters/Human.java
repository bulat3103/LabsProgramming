package characters;

import enums.*;
import interfaces.iHuman;

public abstract class Human implements iHuman {
    private String name;
    private int age;
    private Sex sex;

    public Human() {
        this.name = "Неизвестный";
        this.age = 18;
        this.sex = Sex.BOY;
    }

    public Human(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return this.name;
    }
}
