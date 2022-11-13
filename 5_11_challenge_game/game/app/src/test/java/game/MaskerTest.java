package game;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class MaskerTest {
  private Masker masker;
  private ArrayList<Character> guessed;

  @Before
  public void initialize() {
    masker = new Masker();
    guessed = new ArrayList<Character>();
  }

  @Test
  public void blankGetsMaskedWord() {
    assertEquals(masker.getMaskedWord("MAKERS", guessed), "M_____");
  }

  @Test
  public void testGetsMaskedWord() {
    guessed.add('K');
    assertEquals(masker.getMaskedWord("MAKERS", guessed), "M_K___");
  }
}
