package intellij_game;

import java.util.Random;

public class WordChooser {
    static final String[] DICTIONARY = { "MAKERS", "CANDIES", "DEVELOPER", "LONDON" };

    public String getRandomWordFromDictionary() {
        Random rand = new Random();
        return DICTIONARY[(rand.nextInt(DICTIONARY.length - 1))];
    }
}
