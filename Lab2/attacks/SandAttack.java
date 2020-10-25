package attacks;
import ru.ifmo.se.pokemon.*;
import java.lang.Math;

public class SandAttack extends StatusMove {
	public SandAttack () {
		super (Type.GROUND, 0, 100);
	}
	@Override
	protected void applyOppEffects (Pokemon p) {
		p.setMod (Stat.ACCURACY, -1);
	}
	@Override
	protected String describe () {
		return "понижает точность цели на одну ступень";
	}
}