package mypokemons;

import mymoves.*;
import ru.ifmo.se.pokemon.*;

public class Tapu_Bulu extends Pokemon {
	
	public Tapu_Bulu(String name, int level) {
		super(name, level);
		
		super.setType(Type.GRASS, Type.FAIRY);
		// hp, attack, defense, sp. atk, sp. def, speed
		super.setStats(70, 130, 115, 85, 95, 75);

		Facade facade = new Facade(70, 100);
		Extrasensory extrasensory = new Extrasensory(80, 100);
		Moonblast moonblast = new Moonblast(95, 100);
		Psychic psychic = new Psychic(90, 100);
		
		super.setMove(facade);
		super.setMove(extrasensory);
		super.setMove(moonblast);
		super.setMove(psychic);
	}
	
}
