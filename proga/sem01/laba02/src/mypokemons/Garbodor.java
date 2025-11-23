package mypokemons;

import mymoves.*;
import ru.ifmo.se.pokemon.*;

public class Garbodor extends Pokemon {
	
	public Garbodor(String name, int level) {
		super(name, level);
		
		super.setType(Type.POISON);
		// hp, attack, defense, sp. atk, sp. def, speed
		super.setStats(80, 95, 82, 60, 82, 75);

		Rest rest = new Rest(0, 1);
		AcidSpray acidspray = new AcidSpray(40, 100);
		PoisonGas poisongas = new PoisonGas(0, 90);
		Thunderbolt thunderbolt = new Thunderbolt(90, 100);

		super.setMove(rest);
		super.setMove(acidspray);
		super.setMove(poisongas);
		super.setMove(thunderbolt);
	}
	
}
