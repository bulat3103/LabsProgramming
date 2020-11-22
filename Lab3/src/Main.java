import characters.MainHero;
import enums.*;
import materialObjects.*;

public class Main {
    public static void main(String[] args) {
        Pit pit = new Pit(12);
        MainHero Alice = new MainHero("Алиса", 20, Sex.GIRL, 1.0);
        Alice.setPit(pit);
        for (int i = 1; i <= pit.getDeep(); i++) {
            for (Direction dir : Direction.values()) {
                Thing rnd = Thing.randomThing();
                if (rnd == null) continue;
                pit.addFurn(new Furniture(rnd, dir, i));
            }
        }
        Alice.Look(Direction.DOWN);
        Alice.TryToSee(Direction.DOWN);
        while (Alice.getCurrentCoordinat() < pit.getDeep()) {
            Alice.Fly();
            Direction rndDirection = Direction.randomDirection();
            Alice.Look(rndDirection);
            Alice.TryToSee(rndDirection);
        }
    }
}
