import characters.MainHero;
import enums.*;
import materialObjects.*;
import placesPackage.Place;
import strategies.*;

public class Main {
    public static void main(String[] args) {
        Place place = new Place(Places.PIT, 12);
        MainHero Alice = new MainHero("Алиса", 20, Sex.GIRL, 1.0, place, new DarkIdentificationStrategy());
        for (int i = 1; i <= place.getDeep(); i++) {
            for (Direction dir : Direction.values()) {
                Thing rnd = Thing.randomThing();
                if (rnd == null) continue;
                place.addFurn(new Furniture(rnd, dir, i));
            }
        }
        Alice.Look(Direction.DOWN);
        Alice.Identificate(Direction.DOWN);
        while (Alice.getCurrentCoordinat() < place.getDeep()) {
            Alice.Fly();
            Direction rndDirection = Direction.randomDirection();
            Alice.Look(rndDirection);
            Alice.Identificate(rndDirection);
        }
    }
}
