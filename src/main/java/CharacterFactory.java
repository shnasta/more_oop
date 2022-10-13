import char_dir.Character;
import lombok.SneakyThrows;
import org.reflections.*;

import java.util.Random;
import java.util.Set;

public class CharacterFactory {
    @SneakyThrows
    Character createCharacter() {
        Reflections reflections = new Reflections("");
        Set<Class<? extends Character>> subTypes = reflections.getSubTypesOf(Character.class);
        Object randomCharacter = subTypes.toArray()[new Random().nextInt(subTypes.size())];
        return (Character) randomCharacter.getClass().getConstructor().newInstance();
    }
}

