package mypokemons;

import mymoves.*;
import ru.ifmo.se.pokemon.*;

public class Vigoroth extends Pokemon {
	
	public Vigoroth(String name, int level) {
		super(name, level);
		
		super.setType(Type.NORMAL);
		// hp, attack, defense, sp. atk, sp. def, speed
		super.setStats(80, 80, 80, 55, 55, 90);

		AerialAce aerialace = new AerialAce(60, -1);
		Blizzard blizzard = new Blizzard(110, 70);
		Slash slash = new Slash(70, 100);

		super.setMove(aerialace);
		super.setMove(blizzard);
		super.setMove(slash);
	}
	
}
