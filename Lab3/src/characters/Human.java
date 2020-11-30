package characters;

import enums.*;
import interfaces.IdentificationStrategy;
import interfaces.iHuman;

import java.util.Objects;

public abstract class Human implements iHuman {
    protected String name;
    protected int age;
    protected Sex sex;

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

    public abstract void Identificate(Direction dir);

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
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age &&
                Objects.equals(name, human.name) &&
                sex == human.sex;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex);
    }

    public Sex getSex() {
        return this.sex;
    }
}
