package mymoves;

import lab2.Program;
import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
	
	public Rest(double pow, double acc) {
		super(Type.PSYCHIC, pow, acc);
	}
	
	@Override
    protected void applySelfEffects(Pokemon p){
		p.setMod(Stat.HP, (int) (p.getHP() - p.getStat(Stat.HP)));
		p.addEffect(
				new Effect().condition(Status.SLEEP).turns(2)
		);
    }
	
	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");	
		return "does " + pieces[pieces.length-1];
	}
	
}
