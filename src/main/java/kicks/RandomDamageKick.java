package kicks;

import java.util.Random;

import lotr.Character;

public class RandomDamageKick implements KickStrategy {
    private final Random random = new Random();

    @Override
    public void kick(Character attacker, Character defender) {
        int damage = random.nextInt(attacker.getPower() + 1);
        defender.setHp(defender.getHp() - damage);
        System.out.println(attacker + " hits " + defender + " for " + damage + " hp.");
    }
}
