package pok;
import attacks.*;
import ru.ifmo.se.pokemon.*;

public class Kabuto extends Pokemon {
	public Kabuto (String name, int level) {
		super (name, level);
		setStats (30, 80, 90, 55, 45, 55);
		setType (Type.ROCK, Type.WATER);
		setMove (new SandAttack(), new RockPolish(), new AncientPower());
	}
}