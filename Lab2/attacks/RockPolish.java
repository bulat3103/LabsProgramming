package attacks;
import ru.ifmo.se.pokemon.*;
import java.lang.Math;

public class RockPolish extends StatusMove {
	public RockPolish () {
		super (Type.ROCK, 0, 0);
	}
	@Override
	protected void applySelfEffects (Pokemon p) {
		p.setMod (Stat.SPEED, 2);
	}
	@Override
	protected String describe () {
		return "повышает свою атаку на две ступени";
	}
}