import ru.ifmo.se.pokemon.*;

class Bite extends PhysicalMove {
	protected Bite () {
		super (Type.DARK, 60, 100);
	}
	@Override
	protected void applyOppEffects (Pokemon p) {
		Effect.chance(0.3).flinch(p);
	}
}

class Rest extends StatusMove {
	protected Rest () {
		super (Type.PHYCHIC, 0, 0);
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
        return "Повышает атаку цели на две ступени и сбивает её с толку";
    }
}

class Tackle extends PhysicalMove {
	protected Tackle () {
		super (Type.NORMAL, 50, 100);
	}
	@Override
	protected void applyOppEffects (Pokemon p) {
		Effect.chance(0.2).flinch(p);
	}
}

class DarkPulse extends SpecialMove {
	protected DarkPulse () {
		super (Type.DARK, 80, 100);
	}
	@Override
	protected void applyOppEffects (Pokemon p) {
		Effect.chance(0.2).flinch(p);
	}
}

class SandAttack extends SpecialMove {
	protected SandAttack () {
		super (Type.GROUND, 0, 100);
	}
	@Override
	protected void applyOppEffects (Pokemon p) {
		p.setMod (Stat.ACCURACY, -1);
	}
	@Override
    protected String describe(){
        return "Понижает точность цели на одну ступень";
    }
}

class RockPolish extends SpecialMove {
	protected RockPolish () {
		super (Type.ROCK, 0, 0);
	}
	@Override
	protected void applySelfEffects (Pokemon p) {
		p.setMod (Stat.SPEED, 2);
	}
	@Override
    protected String describe(){
        return "Повышает свою скорость на две ступени";
    }
}

class AncientPower extends StatusMove {
	protected AncientPower () {
		super (Type.ROCK, 60, 100);
	}
	@Override
	protected void applySelfEffects (Pokemon p) {
		
	}
}

class NightSlash extends PhysicalMove {
	protected NightSlash () {
		super (Type.DARK, 70, 100);
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
		}
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
		return "Понижает атаку цели на одну ступень";
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
		return "Понижает спец.атаку цели на одну ступень";
	}
}