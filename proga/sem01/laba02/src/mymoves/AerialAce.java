package mymoves;

import ru.ifmo.se.pokemon.*;

public class AerialAce extends PhysicalMove {
	
	public AerialAce(double pow, double acc) {
		super(Type.FLYING, pow, acc);
	}
	
	private boolean isEffected = false;
	@Override
    protected void applySelfEffects(Pokemon p){
        Status condition = p.getCondition();
        if (condition == Status.BURN | condition == Status.PARALYZE | condition == Status.POISON){
        	isEffected = true;
        }
    }
	
	@Override
    protected void applyOppDamage(Pokemon p, double dmg){
    	p.setMod(Stat.HP, (int) Math.round(dmg));
        if (isEffected) {
        	p.setMod(Stat.HP, (int) Math.round(dmg));
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
