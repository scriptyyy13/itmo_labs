package mymoves;

import lab2.Program;
import ru.ifmo.se.pokemon.*;

public class Extrasensory extends SpecialMove {
	
	public Extrasensory(double pow, double acc) {
		super(Type.PSYCHIC, pow, acc);
	}
	
	@Override
    protected void applyOppEffects(Pokemon p){
		super.applyOppEffects(p);

        Effect e = new Effect().chance(0.1);
        if (e.success()) {
    		Effect.flinch(p);
        }
    }
	
	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");	
		return "does " + pieces[pieces.length-1];
	}
	
}
