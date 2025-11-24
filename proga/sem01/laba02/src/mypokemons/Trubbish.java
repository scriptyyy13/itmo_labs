package mypokemons;

import mymoves.*;
import ru.ifmo.se.pokemon.*;

public class Trubbish extends Pokemon {
	
	public Trubbish(String name, int level) {
		super(name, level);
		
		super.setType(Type.POISON);
		// hp, attack, defense, sp. atk, sp. def, speed
		super.setStats(50, 50, 62, 40, 62, 65);

		Rest rest = new Rest(0, 1);
		AcidSpray acidspray = new AcidSpray(40, 100);
		PoisonGas poisongas = new PoisonGas(0, 90);

		super.setMove(rest, acidspray, poisongas);
	}
	
}
