package mypokemons;

import mymoves.*;
import ru.ifmo.se.pokemon.*;

public class Slaking extends Vigoroth {
	
	public Slaking(String name, int level) {
		super(name, level);
		
		// hp, attack, defense, sp. atk, sp. def, speed
		super.setStats(150, 160, 100, 95, 65, 100);
	}
	
}
