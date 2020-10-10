import ru.ifmo.se.pokemon.*;

public class Furfrou extends Pokemon {
	public Furfrou(String name, int level) {
		super(name, level);
		setStats (75, 80, 60, 65, 90, 102);
		setType(Type.NORMAL);
		setMove (new Bite(), new DarkPulse(), new BabyDollEyes(), new Tackle());
	}
}