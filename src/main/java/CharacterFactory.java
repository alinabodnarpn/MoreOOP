import characters.Character;
import characters.Hobbit;
import characters.Elf;
import characters.King;
import characters.Knight;

import java.util.*;

public class CharacterFactory {
    private static final Random RANDOM = new Random();

    private static final List<Class<? extends Character>> CLASSES =
            Collections.unmodifiableList(Arrays.asList(Hobbit.class, Elf.class, King.class, Knight.class));

    public static Character createCharacter() {
        try {
            int choice = RANDOM.nextInt(CLASSES.size());
            Class<? extends Character> cls = CLASSES.get(choice);
            return cls.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Failed to create character", e);
        }
    }
}
