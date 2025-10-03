package app;

import characters.Character;
import factory.CharacterFactory;
import game.GameManager;

public class Main {
    public static void main(String[] args) {
        Character a = CharacterFactory.createCharacter();
        Character b = CharacterFactory.createCharacter();
        new GameManager().fight(a, b);
    }
}