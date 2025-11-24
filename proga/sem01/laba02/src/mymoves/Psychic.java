package mymoves;

import lab2.Program;
import ru.ifmo.se.pokemon.*;

public class Psychic extends SpecialMove {
	
	public Psychic(double pow, double acc) {
		super(Type.PSYCHIC, pow, acc);
	}
	
	@Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
		p.addEffect(new Effect().stat(Stat.SPECIAL_DEFENSE, -2));
    }
	
	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");	
		return "does " + pieces[pieces.length-1];
	}
	
}
