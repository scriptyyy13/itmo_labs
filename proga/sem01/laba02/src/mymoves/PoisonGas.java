package mymoves;

import lab2.Program;
import ru.ifmo.se.pokemon.*;

public class PoisonGas extends StatusMove {
	
	public PoisonGas(double pow, double acc) {
		super(Type.POISON, pow, acc);
	}
	
	@Override
    protected void applyOppEffects(Pokemon p){
		super.applyOppEffects(p);
		Effect.poison(p);
    }
	
	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");	
		return "does " + pieces[pieces.length-1];
	}
	
}
