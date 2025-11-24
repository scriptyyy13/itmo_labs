package mymoves;

import lab2.Program;
import ru.ifmo.se.pokemon.*;

public class Blizzard extends SpecialMove {
	
	public Blizzard(double pow, double acc) {
		super(Type.ICE, pow, acc);
	}
	
	@Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        
        Effect e = new Effect().chance(0.1);
        if (e.success()) {
    		Effect.freeze(p);
        }
    }
	
	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");	
		return "does " + pieces[pieces.length-1];
	}
	
}
