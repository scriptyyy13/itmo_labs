package mypokemons;

import mymoves.*;
import ru.ifmo.se.pokemon.*;

public class Vigoroth extends Slakoth {
	
	public Vigoroth(String name, int level) {
		super(name, level);
		
		// hp, attack, defense, sp. atk, sp. def, speed
		super.setStats(80, 80, 80, 55, 55, 90);
		
		Slash slash = new Slash(70, 100);

		super.addMove(slash);
	}
	
}
