package kicks;

import lotr.Character;

public class CryKick implements KickStrategy {
    @Override
    public void kick(Character attacker, Character defender) {
        System.out.println(attacker + " cries instead of attacking!");
    }
}
