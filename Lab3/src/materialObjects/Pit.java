package materialObjects;

import java.util.ArrayList;
import java.util.Objects;

public class Pit {
    private int deep;
    private ArrayList<Furniture> furn = new ArrayList<>();

    public Pit() {
        this.deep = 10;
    }

    public Pit(int deep) {
        this.deep = deep;
    }

    public int getDeep() {
        return this.deep;
    }

    public void addFurn(Furniture f) {
        furn.add(f);
    }

    public ArrayList<Furniture> getFurn() {
        return this.furn;
    }


    @Override
    public String toString() {
        return "Колодец с глубиной " + this.deep;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Pit) {
            Pit other = (Pit) o;
            return this.deep == other.deep && this.furn.equals(other.furn);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(deep, furn);
    }
}
