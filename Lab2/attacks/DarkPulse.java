package attacks;
import ru.ifmo.se.pokemon.*;
import java.lang.Math;

public class DarkPulse extends SpecialMove {
	public DarkPulse () {
		super (Type.DARK, 80, 100);
	}
	@Override
	protected void applyOppDamage (Pokemon p, double damage) {
		p.setMod (Stat.HP, (int) Math.round (damage));
	}
	@Override
	protected void applyOppEffects (Pokemon p) {
		if (Math.random () <= 0.2) {
			Effect.flinch (p);
		}
	}
    	@Override
	protected String describe(){
        	return "атакует и имеет 20% вероятность заставить цель дрогнуть";
    	}
}