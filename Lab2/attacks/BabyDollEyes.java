package attacks;
import ru.ifmo.se.pokemon.*;
import java.lang.Math;

public class BabyDollEyes extends StatusMove {
	public BabyDollEyes () {
		super (Type.FAIRY, 0, 100);
	}
	@Override
	protected void applyOppEffects (Pokemon p) {
		p.setMod (Stat.ATTACK, -1);
	}
	@Override
	protected String describe () {
		return "понижает атаку цели на одну ступень";
	}
}