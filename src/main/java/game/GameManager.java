package game;
import characters.Character;

public class GameManager {
    public void fight(Character c1, Character c2) {
        System.out.println("Fight starts: " + c1 + " vs " + c2);
        int round = 1;
        while (c1.isAlive() && c2.isAlive()) {
            System.out.println("Round: " + (round++));
            c1.kick(c2);
            if (!c2.isAlive()) break;
            c2.kick(c1);
        }
        System.out.println("Fight ends! Winner: " + (c1.isAlive() ? c1 : c2));
    }
}
