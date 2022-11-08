package game;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameTest {
  @Test
  public void testGetWordToGuess() {
    Game game = new Game();
    assertEquals(game.getWordToGuess("MAKERS"), "M_____");
  }

  @Test
  public void testGetRemainingAttempts() {
    Game game = new Game();
    assertEquals(game.getRemainingAttempts(), Integer.valueOf(10));
  }

  @Test
  public void getRandomWordFromDictionary() {
    Game game = new Game();
    assertEquals(game.getRandomWordFromDictionary(), "MAKERS");
  }
}
