package lab2;

import mypokemons.*;
import ru.ifmo.se.pokemon.*;

public class Program {
	// javac -d build -cp "src:lib/Pokemon.jar" src/lab2/Program.java src/mymoves/*.java
	// java -cp "build:lib/Pokemon.jar" lab2.Program
	// jar cfm Main.jar mf.txt lab2 mymoves mypokemons
	
	// https://pokemondb.net/pokedex/tapu-bulu
	// https://pokemondb.net/pokedex/trubbish
	// https://pokemondb.net/pokedex/garbodor
	// https://pokemondb.net/pokedex/slakoth
	// https://pokemondb.net/pokedex/vigoroth
	// https://pokemondb.net/pokedex/slaking
	
	public static void main(String[] args) {
		Battle b = new Battle();
		Tapu_Bulu tapu_bulu = new Tapu_Bulu("Тапу-Булу", 1);
		Vigoroth vigoroth = new Vigoroth("Вигоротх", 1);
		Slaking slaking = new Slaking("Слакинг", 1);
		Garbodor garbodor = new Garbodor("Гарбодор", 1);
		Slakoth slakoth = new Slakoth("Слакотх", 1);
		Trubbish trubbish = new Trubbish("Трубишь", 1);

		b.addAlly(tapu_bulu);
		b.addAlly(vigoroth);
		b.addAlly(slaking);
		b.addFoe(garbodor);
		b.addFoe(slakoth);
		b.addFoe(trubbish);
		b.go();
	}

	public static boolean chance(double d) {
		return d > Math.random();
	}
}
