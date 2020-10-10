import ru.ifmo.se.pokemon.*;
import java.lang.Math;

class Bite extends PhysicalMove {
	protected Bite () {
		super (Type.DARK, 60, 100);
	}
	@Override
	protected void applyOppDamage (Pokemon p, double damage) {
		p.setMod (Stat.HP, (int) Math.round (damage));
	}
	@Override
	protected void applyOppEffects (Pokemon p) {
		if (Math.random () <= 0.3) {
			Effect.flinch (p);
		}
	}
	@Override
	protected String describe () {
		return "атакует и имеет 30% вероятность заставить цель дрогнуть";
	}
}

class Rest extends StatusMove {
	protected Rest () {
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

class Swagger extends StatusMove {
	protected Swagger () {
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

class Tackle extends PhysicalMove {
	protected Tackle () {
		super (Type.NORMAL, 50, 100);
	}
	@Override
	protected void applyOppDamage (Pokemon p, double damage) {
		p.setMod (Stat.HP, (int) Math.round(damage));
	}
}

class DarkPulse extends SpecialMove {
	protected DarkPulse () {
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

class SandAttack extends StatusMove {
	protected SandAttack () {
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

class RockPolish extends StatusMove {
	protected RockPolish () {
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

class AncientPower extends SpecialMove {
	protected AncientPower () {
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

class NightSlash extends PhysicalMove {
	protected NightSlash () {
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

class WakeUpSlap extends PhysicalMove {
	protected WakeUpSlap () {
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

class BabyDollEyes extends StatusMove {
	protected BabyDollEyes () {
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

class Confide extends StatusMove {
	protected Confide () {
		super (Type.NORMAL, 0, 0);
	}
	@Override
	protected void applyOppEffects (Pokemon p) {
		p.setMod (Stat.SPECIAL_ATTACK, -1);
	}
	@Override
	protected String describe () {
		return "понижает специальную атаку цели на одну ступень";
	}
}