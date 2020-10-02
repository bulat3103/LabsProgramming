import ru.ifmo.se.pokemon.*;

public class Kabutops extends Kabuto {
	public Kabuto (String name, int level) {
		super (name, level);
		setStats (60, 115, 105, 65, 70, 80);
		setType(Type.ROCK, Type.WATER);
		//setMove (new SandAttack(), new RockPolish(), new AncientPower(), new NightSlash());
	}
}