package lotr;

import kicks.RandomDamageKick;
import java.util.Random;

public class Knight extends Character {
    private static final Random RANDOM = new Random();

    public Knight() {
        super(RANDOM.nextInt(11) + 2, RANDOM.nextInt(11) + 2, new RandomDamageKick());
    }
}