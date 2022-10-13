import char_dir.Character;

public class Elf extends char_dir.Character {
    public Elf() {
        super(10, 10);
    }

    @Override
    public void kick(Character c) {
        System.out.println(this.getClass().getSimpleName() + " kicks " + c.getClass().getSimpleName()
                + " and took " + getPower() + " hp.");
        if (this.getPower() > c.getPower()) {
            c.setHp(0);
        }
        else {
            c.setPower(c.getPower() - 1);
        }
        if (!c.isAlive()) {
            System.out.println(c.getClass().getSimpleName() + " is dead.");
        }
    }
}
