package game;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameTest {
  @Test
  public void testGetWordToGuess() {
    Game game = new Game();
    assertEquals(game.getWordToGuess(), "B____");
  }
}
