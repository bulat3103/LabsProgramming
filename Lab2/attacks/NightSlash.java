package attacks;
import ru.ifmo.se.pokemon.*;
import java.lang.Math;

public class NightSlash extends PhysicalMove {
	public NightSlash () {
		super (Type.DARK, 70, 100);
	}
	@Override
	protected void applyOppDamage (Pokemon p, double damage) {
		p.setMod (Stat.HP, (int) Math.round (damage));
	}
	@Override
	protected double calcCriticalHit (Pokemon att, Pokemon def) {
		if (att.getStat(Stat.SPEED) / 8.0 > Math.random()) {
            System.out.println("Критический удар");
            return 2.0;
        }
        return 1.0;
	}
	@Override
	protected String describe () {
		return "атакует и повышает критический удар";
	}
}