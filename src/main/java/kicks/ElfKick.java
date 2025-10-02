package kicks;

import characters.Character;

public class ElfKick implements KickStrategy {
    @Override
    public void kick(Character attacker, Character defender) {
        if (defender.getPower() < attacker.getPower()) {
            defender.setHp(0);
            System.out.println(attacker + " kills " + defender + " (power advantage).");
        } else {
            int newPower = Math.max(0, defender.getPower() - 1);
            defender.setPower(newPower);
            System.out.println(attacker + " weakens " + defender + " by 1 power (now " + newPower + ").");
        }
    }
}