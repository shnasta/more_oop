import char_dir.Character;

import java.util.Random;

public class Knight extends char_dir.Character{

    public Knight() {
        super(new Random().nextInt(10) + 2, new Random().nextInt(10) + 2);
    }

    @Override
    public void kick(Character c) {
        super.puperkick(c);
    }
}
