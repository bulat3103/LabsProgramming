package enums;

public enum Places {
    PIT("колодец"),
    HOLE("яма"),
    BASEMENT("подвал");

    private String title;

    Places(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
