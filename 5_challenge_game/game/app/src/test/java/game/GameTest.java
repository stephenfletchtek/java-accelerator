package game;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class GameTest {
  @Test
  public void testGetWordToGuess() {
    WordChooser mockWordChooser = mock(WordChooser.class);
    when(mockWordChooser.getRandomWordFromDictionary()).thenReturn("MAKERS");
    Game game = new Game(mockWordChooser);
    assertEquals(game.getWordToGuess(), "M_____");
  }

  @Test
  public void testGetRemainingAttempts() {
    WordChooser mockWordChooser = mock(WordChooser.class);
    Game game = new Game(mockWordChooser);
    assertEquals(game.getRemainingAttempts(), Integer.valueOf(10));
  }
}
