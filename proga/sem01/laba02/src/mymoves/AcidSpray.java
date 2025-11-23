package mymoves;

import lab2.Program;
import ru.ifmo.se.pokemon.*;

public class AcidSpray extends SpecialMove {
	
	public AcidSpray(double pow, double acc) {
		super(Type.POISON, pow, acc);
	}
	
	@Override
    protected void applyOppEffects(Pokemon p){
		p.setMod(Stat.SPECIAL_DEFENSE, -2);
    }
	
	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");	
		return "does " + pieces[pieces.length-1];
	}
	
}
