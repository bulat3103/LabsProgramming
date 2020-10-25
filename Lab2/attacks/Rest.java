package attacks;
import ru.ifmo.se.pokemon.*;
import java.lang.Math;

public class Rest extends StatusMove {
	public Rest () {
		super (Type.PSYCHIC, 0, 0);
	}
	@Override
  	protected boolean checkAccuracy(Pokemon att, Pokemon def) {
    	return true;
  	}
	@Override
	protected void applySelfEffects (Pokemon p) {
		p.setMod(Stat.HP, (int) (p.getHP() - p.getStat(Stat.HP)));
		p.setCondition(new Effect().condition(Status.SLEEP).attack(0.0).turns(2));
	}
	@Override
	protected String describe () {
		return "восстанавливает здоровье и засыпает на 2 хода";
	}
}