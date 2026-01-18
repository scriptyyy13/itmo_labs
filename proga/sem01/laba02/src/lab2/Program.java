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
	// https://pokemondb.net/pokedex/slakothы
	// https://pokemondb.net/pokedex/vigoroth
	// https://pokemondb.net/pokedex/slaking
	
	public static void main(String[] args) {
		Battle b = new Battle();
		ThisExample example = new ThisExample();
		Tapu_Bulu tapu_bulu = new Tapu_Bulu("Тапу-Булу", 20);
		Vigoroth vigoroth = new Vigoroth("Вигоротх", 100);
		Slaking slaking = new Slaking("Слакинг", 10);
		Garbodor garbodor = new Garbodor("Гарбодор", 50);
		Slakoth slakoth = new Slakoth("Слакотх", 90);
		Trubbish trubbish = new Trubbish("Трубишь", 150);

		b.addAlly(tapu_bulu);
		b.addAlly(vigoroth);
		b.addAlly(slaking);
		b.addFoe(garbodor);
		b.addFoe(slakoth);
		b.addFoe(trubbish);
		b.go();
	}
}
