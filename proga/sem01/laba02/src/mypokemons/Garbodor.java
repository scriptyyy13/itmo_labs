package mypokemons;

import mymoves.*;
import ru.ifmo.se.pokemon.*;

public class Garbodor extends Trubbish {
	
	public Garbodor(String name, int level) {
		super(name, level);
		
		// hp, attack, defense, sp. atk, sp. def, speed
		super.setStats(80, 95, 82, 60, 82, 75);

		Thunderbolt thunderbolt = new Thunderbolt(90, 100);
		
		super.addMove(thunderbolt);
	}
	
}
