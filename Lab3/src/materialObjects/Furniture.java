package materialObjects;

import characters.Human;
import enums.*;

import java.util.Objects;

public class Furniture {
    private Thing type;
    private Direction dir;
    private int deepCoordinat;

    public Furniture() {
        this.type = Thing.PICTURE;
        this.dir = Direction.LEFT;
    }

    public Furniture(Thing type, Direction dir, int deepCoordinat) {
        this.type = type;
        this.dir = dir;
        this.deepCoordinat = deepCoordinat;
    }

    public int getDeepCoordinat() {
        return this.deepCoordinat;
    }

    public Thing getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return this.type.name();
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Furniture) {
            Furniture other = (Furniture) o;
            return this.type.equals(other.type) && this.deepCoordinat == other.deepCoordinat && this.dir.equals(other.dir);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, dir, deepCoordinat);
    }

    public Direction getDir() {
        return this.dir;
    }
}
