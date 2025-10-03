package kicks;

import lotr.Character;

public interface KickStrategy {
    void kick(Character attacker, Character opponent);
}