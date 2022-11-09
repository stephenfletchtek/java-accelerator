package game;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WordChooserTest {
  @Test
  public void getRandomWordFromDictionary() {
    WordChooser wordChooser = new WordChooser();
    assertEquals(wordChooser.getRandomWordFromDictionary(), "MAKERS");
  }
}
