package characters;

import enums.*;
import interfaces.IdentificationStrategy;
import interfaces.iHuman;
import materialObjects.Furniture;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Human implements iHuman {
    protected String name;
    protected int age;
    protected Sex sex;
    protected IdentificationStrategy IStrategy;

    public Human() {
        this.name = "Неизвестный";
        this.age = 18;
        this.sex = Sex.BOY;
    }

    public Human(String name, int age, Sex sex, IdentificationStrategy IStrategy) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.IStrategy = IStrategy;
    }

    public abstract ArrayList<Furniture> Identificate(Direction dir);

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setIStrategy(IdentificationStrategy iStrategy) {
        this.IStrategy = iStrategy;
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
