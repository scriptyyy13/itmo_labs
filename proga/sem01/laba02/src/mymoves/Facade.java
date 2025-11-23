package mymoves;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
	
	public Facade(double pow, double acc) {
		super(Type.NORMAL, pow, acc);
	}
	
	@Override
    protected void applySelfEffects(Pokemon p){
        Status condition = p.getCondition();
        if (condition == Status.BURN | condition == Status.PARALYZE | condition == Status.POISON){
            this.power *= 2;
        }
    }
	
	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");	
		return "does " + pieces[pieces.length-1];
	}
	
}
