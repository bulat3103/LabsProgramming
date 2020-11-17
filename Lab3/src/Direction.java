public enum Direction {
    DOWN ("вниз"),
    UP ("вверх"),
    LEFT ("налево"),
    RIGHT ("направо"),
    BACK ("назад"),
    FORWARD ("вперед");

    private String title;

    Direction(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
