package materialObjects;

import java.util.ArrayList;
import java.util.Objects;

public class Pit {
    private int deep;
    private ArrayList<Furniture> furn = new ArrayList<>();

    @Override
    public String toString() {
        return "materialObjects.Pit{" +
                "deep=" + deep +
                ", furn=" + furn +
                '}';
    }

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pit pit = (Pit) o;
        return deep == pit.deep &&
                furn.equals(pit.furn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deep, furn);
    }
}
