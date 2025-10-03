package app;

import factory.CharacterFactory;
import game.GameManager;
import lotr.Character;

public class Main {
    public static void main(String[] args) {
        Character a = CharacterFactory.createCharacter();
        Character b = CharacterFactory.createCharacter();
        new GameManager().fight(a, b);
    }
}