package attacks;
import ru.ifmo.se.pokemon.*;
import java.lang.Math;

public class Tackle extends PhysicalMove {
	public Tackle () {
		super (Type.NORMAL, 50, 100);
	}
	@Override
	protected void applyOppDamage (Pokemon p, double damage) {
		p.setMod (Stat.HP, (int) Math.round(damage));
	}
}