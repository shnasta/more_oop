import char_dir.Character;

import java.util.Random;

public class King extends char_dir.Character {
    public King() {
        super(new Random().nextInt(10) + 5, new Random().nextInt(10) + 5);
    }

    @Override
    public void kick(Character c) {
        super.puperkick(c);
    }
}
