package lotr;

import kicks.KickStrategy;

public abstract class Character {
    private int power;
    private int hp;
    protected final KickStrategy kickStrategy;

    public Character(int power, int hp, KickStrategy kickStrategy) {
        this.power = Math.max(0, power);
        this.hp = Math.max(0, hp);
        this.kickStrategy = kickStrategy;
    }

    public void kick(Character c) {
        kickStrategy.kick(this, c);
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public void setHp(int hp) {
        this.hp = Math.max(0, hp); // clamp at 0
    }

    public int getHp() {
        return hp;
    }

    public void setPower(int power) {
        this.power = Math.max(0, power);
    }

    public int getPower() {
        return power;
    }
    @Override
    public String toString() {
    return getClass().getSimpleName() + "{hp=" + hp + ", power=" + power + "}";
}
}

