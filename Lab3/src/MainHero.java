public class MainHero extends Human implements iFlyable{
    private int currentCoordinat = 0;
    private double speed;

    public MainHero() {
        super();
        this.speed = 0;
    }

    public MainHero(String name, int age, Sex sex, double speed) {
        super(name, age, sex);
        this.speed = speed;
    }

    @Override
    public void Fly() {
        System.out.println(super.getName() + "летит не спеша");
    }

    @Override
    public void Look() {

    }

    @Override
    public void Say() {

    }

    public void TryToSee() {

    }

    public int getCurrentCoordinat() {
        return currentCoordinat;
    }
}
