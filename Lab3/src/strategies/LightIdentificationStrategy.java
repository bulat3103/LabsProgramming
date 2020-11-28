package strategies;

import enums.Direction;
import interfaces.IdentificationStrategy;
import materialObjects.Furniture;

import java.util.ArrayList;

public class LightIdentificationStrategy implements IdentificationStrategy {

    @Override
    public String Identificate(Direction dir, ArrayList<Furniture> furn, double currentCoordinat) {
        if (dir == Direction.UP) {
            return "Я вижу выход, но не тот :)";
        }
        if (dir == Direction.DOWN) {
            return "Я вижу волшебную дверь. Скорее бы долететь!!!";
        }
        String message = "Я ничего не вижу, там ничего нет.";
        for (Furniture e : furn) {
            if (e.getDir().toString().equals(dir.toString()) && e.getDeepCoordinat() == (int) currentCoordinat) {
                message = "Я вижу " + e.getType().toString();
            }
        }
        return message;
    }
}
