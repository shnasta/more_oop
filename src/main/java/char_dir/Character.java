package char_dir;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Random;

@Getter @Setter @ToString
public abstract class Character {
    public Character(int hp, int power) {
        this.setHp(hp);
        this.setPower(power);
    }
    private int hp;
    private int power;

    public void setHp(int hp) {
        if (hp < 0)
            hp = 0;
        this.hp = hp;
    }

    public void kick(Character c) {
        System.out.println(this.getClass().getSimpleName() + " kicks " + c.getClass().getSimpleName()
        + " and took " + getPower() + " hp.");
        c.setHp(c.getHp() - getPower());
        if (!c.isAlive()) {
            System.out.println(c.getClass().getSimpleName() + " is dead.");
        }
    }

    public void puperkick(Character c) {
        Random rn = new Random();
        int damage = rn.nextInt(getPower());
        System.out.println(this.getClass().getSimpleName() + " kicks " + c.getClass().getSimpleName()
                + " and took " + damage + " hp.");
        c.setHp(c.getHp() - damage);
        if (!c.isAlive()) {
            System.out.println(c.getClass().getSimpleName() + " is dead.");
        }
    }

    public boolean isAlive() {
        return getHp() > 0;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{hp=" + this.getHp() + ", power=" + this.getPower() + "}";
    }
}
