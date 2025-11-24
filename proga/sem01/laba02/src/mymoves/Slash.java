package mymoves;

import lab2.Program;
import ru.ifmo.se.pokemon.*;

public class Slash extends PhysicalMove {
	
	public Slash(double pow, double acc) {
		super(Type.FLYING, pow, acc);
	}

	@Override
    protected double calcCriticalHit(Pokemon att, Pokemon def) {
		return 3.0 * super.calcCriticalHit(att, def);
    }
	
	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");	
		return "does " + pieces[pieces.length-1];
	}
	
}
