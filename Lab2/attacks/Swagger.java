package attacks;
import ru.ifmo.se.pokemon.*;
import java.lang.Math;

public class Swagger extends StatusMove {
	public Swagger () {
		super (Type.NORMAL, 0, 90);
	}
	@Override
	protected void applyOppEffects (Pokemon p) {
		p.setMod (Stat.ATTACK, 2);
		Effect.confuse (p);
	}
	@Override
	protected String describe(){
        return "повышает атаку цели на две ступени и сбивает её с толку";
    }
}