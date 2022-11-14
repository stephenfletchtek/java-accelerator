package intellij_game;

import java.util.Arrays;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class WordChooserTest {
    @Test
    public void getRandomWordFromDictionary() {
        WordChooser wordChooser = new WordChooser();
        String[] TEST_DICT = { "MAKERS", "CANDIES", "DEVELOPER", "LONDON" };
        assertTrue(Arrays.asList(TEST_DICT).contains(wordChooser.getRandomWordFromDictionary()));
    }
}
