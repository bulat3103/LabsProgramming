import java.util.ArrayList;

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

    public void addFurn() {

    }

    public ArrayList<Furniture> getFurn() {
        return furn;
    }
}
