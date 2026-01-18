package mymoves;

import ru.ifmo.se.pokemon.*;

public class AcidSpray extends SpecialMove {
	static {
		System.out.println("1234");
	}
	
	public AcidSpray(double pow, double acc) {
		super(Type.POISON, pow, acc);
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
