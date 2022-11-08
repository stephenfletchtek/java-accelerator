package game;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameTest {
  @Test
  public void testGetWordToGuess() {
    Game game = new Game("MAKERS");
    assertEquals(game.getWordToGuess(), "M_____");
  }

  @Test
  public void testGetRemainingAttempts() {
    Game game = new Game("MAKERS");
    assertEquals(game.getRemainingAttempts(), Integer.valueOf(10));
  }
}
