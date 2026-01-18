package lab2;

import java.util.Random;

import ru.ifmo.se.pokemon.*;

public abstract class MyPokemon extends Pokemon {
    
    private static final Random rnd = new Random();

    public MyPokemon(String name, int level) {
        super(name, level);

        int bonus = level / 10;
        if (bonus == 0) return;

        // пока меньше 3 типов и есть бонусы добавляем рандомный тип
        while (bonus > 0 && getTypes().length < 3) {
            Type newType = Type.values()[rnd.nextInt(Type.values().length)];
            boolean alreadyHas = false;
            for (Type t : getTypes()) {
                if (t == newType) {
                    alreadyHas = true;
                    break;
                }
            }
            if (!alreadyHas) {
                addType(newType);
                System.out.println("ADDED TYPE: " + newType + " TO " + name + " LVL " + level);
                bonus--;
            }
        }

        double mult = Math.pow(1.2, bonus);

        setStats(
            getStat(Stat.HP),
            getStat(Stat.ATTACK) * mult,
            getStat(Stat.DEFENSE),
            getStat(Stat.SPECIAL_ATTACK) * mult,
            getStat(Stat.SPECIAL_DEFENSE),
            getStat(Stat.SPEED)
        );
    }
}