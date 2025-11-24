package mymoves;

import lab2.Program;
import ru.ifmo.se.pokemon.*;

public class Moonblast extends SpecialMove {
	
	public Moonblast(double pow, double acc) {
		super(Type.FAIRY, pow, acc);
	}

	@Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
		p.addEffect(new Effect().stat(Stat.SPECIAL_ATTACK, -1));
    }
	
	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");	
		return "does " + pieces[pieces.length-1];
	}
	
}
