package strategies;

import enums.Direction;
import interfaces.IdentificationStrategy;
import materialObjects.Furniture;

import java.util.ArrayList;

public class DarkIdentificationStrategy implements IdentificationStrategy {

    @Override
    public String Identificate(Direction dir, ArrayList<Furniture> furn, double currentCoordinat) {
        if (dir == Direction.DOWN) {
            return "Я не вижу, что внизу. Слишком темно.";
        }
        if (dir == Direction.UP) {
            return "Я вижу выход, но не тот :)";
        }
        String message = "Я ничего не вижу, там ничего нет.";
        for (Furniture e : furn) {
            if (e.getDir().toString().equals(dir.toString()) && e.getDeepCoordinat() == (int) currentCoordinat) {
                message = "Плохо видно, но кажется я увидела " + e.getType().toString();
            }
        }
        return message;
    }
}
