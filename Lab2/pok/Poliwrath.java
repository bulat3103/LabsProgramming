package pok;
import attacks.*;
import ru.ifmo.se.pokemon.*;

public class Poliwrath extends Poliwhirl {
	public Poliwrath (String name, int level) {
		super (name, level);
		setStats (90, 95, 95, 70, 90, 70);
		setType(Type.FIGHTING, Type.WATER);
		setMove (new Rest(), new Swagger(), new WakeUpSlap(), new Confide());
	}
}