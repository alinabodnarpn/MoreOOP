package characters;

import kicks.RandomDamageKick;
import java.util.Random;

public class King extends Character {
    private static final Random RANDOM = new Random();

    public King() {
        super(RANDOM.nextInt(11) + 5, RANDOM.nextInt(11) + 5, new RandomDamageKick());
    }
}






