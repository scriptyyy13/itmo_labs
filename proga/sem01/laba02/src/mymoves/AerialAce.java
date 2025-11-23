package mymoves;

import ru.ifmo.se.pokemon.*;

public class AerialAce extends PhysicalMove {
	
	public AerialAce(double pow, double acc) {
		super(Type.FLYING, pow, acc);
	}
	
	@Override
    protected void applySelfEffects(Pokemon p){
        Status condition = p.getCondition();
        if (condition == Status.BURN | condition == Status.PARALYZE | condition == Status.POISON){
            this.power *= 2;
        }
    }

    @Override
    protected boolean checkAccuracy(Pokemon p1, Pokemon p2){
        return true;
    }
    
	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");	
		return "does " + pieces[pieces.length-1];
	}
	
}
