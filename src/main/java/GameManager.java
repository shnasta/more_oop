import char_dir.Character;

public class GameManager {
    void fight(Character c1, Character c2) {
        for (int i = 0; c1.isAlive() && c2.isAlive(); i++) {
            if (i % 2 == 0)
                c1.kick(c2);
            else
                c2.kick(c1);
        }
    }
}

