package materialObjects;

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
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Furniture furniture = (Furniture) o;
        return deepCoordinat == furniture.deepCoordinat &&
                type.equals(furniture.type) &&
                dir.equals(furniture.dir);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, dir, deepCoordinat);
    }

    public Direction getDir() {
        return this.dir;
    }
}
