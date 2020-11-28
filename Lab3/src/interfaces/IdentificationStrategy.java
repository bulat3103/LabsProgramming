package interfaces;

import enums.Direction;
import materialObjects.Furniture;

import java.util.ArrayList;

public interface IdentificationStrategy {
    String Identificate(Direction dir, ArrayList<Furniture> furn, double currentCoordinat);
}
