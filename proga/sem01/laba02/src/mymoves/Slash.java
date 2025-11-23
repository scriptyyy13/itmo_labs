package mymoves;

import lab2.Program;
import ru.ifmo.se.pokemon.*;

public class Slash extends PhysicalMove {
	
	public Slash(double pow, double acc) {
		super(Type.FLYING, pow, acc);
	}

	@Override
    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        if (Program.chance(1.0 / 8)) {
            return 2.0;
        }
        return 1.0;
    }
	
	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");	
		return "does " + pieces[pieces.length-1];
	}
	
}
