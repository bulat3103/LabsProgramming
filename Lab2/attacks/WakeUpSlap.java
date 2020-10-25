package attacks;
import ru.ifmo.se.pokemon.*;
import java.lang.Math;

public class WakeUpSlap extends PhysicalMove {
	public WakeUpSlap () {
		super (Type.FIGHTING, 60, 100);
	}
	@Override
	protected void applyOppDamage (Pokemon def, double damage) {
		Status pokemonCond = def.getCondition ();
		if (pokemonCond.equals (Status.SLEEP)) {
			def.setMod (Stat.HP, (int) Math.round (damage) * 2);
		} else {
			def.setMod (Stat.HP, (int) Math.round (damage));
		}
	}
	@Override
	protected void applyOppEffects (Pokemon p) {
		p.setCondition (new Effect());
	}
	@Override
	protected String describe () {
		return "атакует, сила удваивается, если цель спит";
	}
}