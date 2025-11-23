package mypokemons;

import mymoves.*;
import ru.ifmo.se.pokemon.*;

public class Slakoth extends Pokemon {
	
	public Slakoth(String name, int level) {
		super(name, level);
		
		super.setType(Type.NORMAL);
		// hp, attack, defense, sp. atk, sp. def, speed
		super.setStats(60, 60, 60, 35, 35, 30);

		AerialAce aerialace = new AerialAce(60, -1);
		Blizzard blizzard = new Blizzard(110, 70);

		super.setMove(aerialace);
		super.setMove(blizzard);
	}
	
}
