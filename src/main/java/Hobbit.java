import char_dir.Character;

public class Hobbit extends char_dir.Character {
    public Hobbit() {
        super(3,0);
    }
    @Override
    public void kick(Character c) {
        System.out.println(this.getClass().getSimpleName() + " kicks " + c.getClass().getSimpleName()
                + " and took " + getPower() + " hp.");
        super.kick(c);
        System.out.println("please" + c + "cry cry cry");
        if (!c.isAlive()) {
            System.out.println(c.getClass().getSimpleName() + " is dead.");
        }
    }
}
