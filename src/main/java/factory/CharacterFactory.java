package factory;

import lotr.Character;
import org.reflections.Reflections;
import java.util.*;

public class CharacterFactory {
    private static final Random RANDOM = new Random();
    private static final List<Class<? extends Character>> CLASSES;

    static {
        Reflections reflections = new Reflections("lotr");
        Set<Class<? extends Character>> subTypes = reflections.getSubTypesOf(Character.class);
        CLASSES = new ArrayList<>(subTypes);
    }

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
