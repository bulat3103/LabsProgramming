package strategies;

import enums.Direction;
import interfaces.IdentificationStrategy;
import materialObjects.Furniture;
import placesPackage.APlace;

import java.util.ArrayList;

public class DarkIdentificationStrategy implements IdentificationStrategy {

    @Override
    public ArrayList<Furniture> Identificate(Direction dir, APlace place, double currentCoordinat) {
        if (dir == Direction.UP) {
            System.out.println("Я вижу выход, но не тот :)");
        } else {
            System.out.println("Тут очень темно");
        }
        return new ArrayList<>();
    }
}
