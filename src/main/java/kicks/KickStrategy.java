package kicks;

import characters.Character;

public interface KickStrategy {
    void kick(Character attacker, Character opponent);
}