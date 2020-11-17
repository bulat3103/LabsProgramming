public class Furniture {
    private Thing type;
    private Direction dir;
    private int deepCoordinat;

    public Furniture() {
        this.type = Thing.PICTURE;
        this.dir = Direction.LEFT;
    }

    public Furniture(Thing type, Direction dir) {
        this.type = type;
        this.dir = dir;
    }

    public int getDeepCoordinat() {
        return this.deepCoordinat;
    }

    public Thing getType() {
        return this.type;
    }

    public Direction getDir() {
        return this.dir;
    }
}
