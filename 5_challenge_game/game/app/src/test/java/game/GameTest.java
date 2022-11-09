package game;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class GameTest {
  @Test
  public void testGetWordToGuess() {
    Game game = new Game(new WordChooser());
    assertEquals(game.getWordToGuess("MAKERS"), "M_____");
  }

  @Test
  public void testGetRemainingAttempts() {
    Game game = new Game(new WordChooser());
    assertEquals(game.getRemainingAttempts(), Integer.valueOf(10));
  }

  @Test
  public void getRandomWordFromDictionary() {
    WordChooser mockWordChooser = mock(WordChooser.class);
    when(mockWordChooser.getRandomWordFromDictionary()).thenReturn("MAKERS");
    Game game = new Game(mockWordChooser);
    assertEquals(game.getRandomWordFromDictionary(), "MAKERS");
  }
}
