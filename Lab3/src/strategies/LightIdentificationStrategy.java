package strategies;

import enums.Direction;
import interfaces.IdentificationStrategy;
import materialObjects.Furniture;
import placesPackage.APlace;

import java.util.ArrayList;

public class LightIdentificationStrategy implements IdentificationStrategy {

    @Override
    public ArrayList<Furniture> Identificate(Direction dir, APlace place, double currentCoordinat) {
        ArrayList<Furniture> seen = new ArrayList<>();
        if (dir == Direction.UP) {
            System.out.println("Я вижу выход, но не тот :)");
            return seen;
        }
        if (dir == Direction.DOWN) {
            System.out.println("Я вижу волшебную дверь. Скорее бы долететь!!!");
            return seen;
        }
        for (Furniture e : place.getFurn()) {
            if (e.getDir().toString().equals(dir.toString()) && e.getDeepCoordinat() == (int) currentCoordinat) {
                seen.add(e);
            }
        }
        return seen;
    }
}
