package characters;

import enums.*;
import interfaces.IdentificationStrategy;
import interfaces.iHuman;

import java.util.Objects;

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

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Human) {
            Human other = (Human) o;
            return this.name.equals(other.name) && this.age == other.age && this.sex.equals(other.sex);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex);
    }

    public Sex getSex() {
        return this.sex;
    }
}
