import char_dir.Character;
import org.reflections.*;

import java.util.Random;
import java.util.Set;

public class CharacterFactory {
    void createCharacter() {
        Reflections reflections = new Reflections("");
        Set<Class<? extends Character>> subTypes = reflections.getSubTypesOf(Character.class);
        Random rn = new Random();
        int index = rn.nextInt(subTypes.size());
        Object[] myCharact = subTypes.toArray();
        System.out.println(myCharact);
    }

    public static void main(String[] args) {
        CharacterFactory a = new CharacterFactory();
        a.createCharacter();
    }
}

