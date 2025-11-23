package mymoves;

import lab2.Program;
import ru.ifmo.se.pokemon.*;

public class Psychic extends SpecialMove {
	
	public Psychic(double pow, double acc) {
		super(Type.PSYCHIC, pow, acc);
	}
	
	@Override
    protected void applyOppEffects(Pokemon p){
		if (Program.chance(0.1)) {
            p.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
    }
	
	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");	
		return "does " + pieces[pieces.length-1];
	}
	
}
