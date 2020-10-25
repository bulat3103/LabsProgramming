package attacks;
import ru.ifmo.se.pokemon.*;
import java.lang.Math;

public class AncientPower extends SpecialMove {
	public AncientPower () {
		super (Type.ROCK, 60, 100);
	}
	@Override
	protected void applyOppDamage (Pokemon p, double damage) {
		p.setMod (Stat.HP, (int) Math.round (damage));
	}
	@Override
	protected void applySelfEffects (Pokemon p) {
		if (Math.random () <= 0.1) {
			for (Stat c : Stat.values()) {
				p.setMod (c, 1);
			}
		}
	}
	@Override
	protected String describe () {
		return "атакует и имеет 10% вероятность повысить все свои характеристики на одну ступень";
	}
}