package kicks;

import lotr.Character;

public class WeakerKick implements KickStrategy {
    @Override
    public void kick(Character attacker, Character opponent) {
        if (opponent.getPower() < attacker.getPower()) {
            opponent.setHp(0);
            System.out.println(attacker.getClass().getSimpleName() + " kills " + 
                             opponent.getClass().getSimpleName() + " instantly!");
        } else {
            opponent.setPower(opponent.getPower() - 1);
            System.out.println(attacker.getClass().getSimpleName() + " decreases " + 
                             opponent.getClass().getSimpleName() + "'s power to " + opponent.getPower());
        }
    }
}
