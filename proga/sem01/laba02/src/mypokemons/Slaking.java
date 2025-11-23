package mypokemons;

import mymoves.*;
import ru.ifmo.se.pokemon.*;

public class Slaking extends Pokemon {
	
	public Slaking(String name, int level) {
		super(name, level);
		
		super.setType(Type.NORMAL);
		// hp, attack, defense, sp. atk, sp. def, speed
		super.setStats(150, 160, 100, 95, 65, 100);

		AerialAce aerialace = new AerialAce(60, -1);
		Blizzard blizzard = new Blizzard(110, 70);
		Slash slash = new Slash(70, 100);

		super.setMove(aerialace);
		super.setMove(blizzard);
		super.setMove(slash);
	}
	
}
