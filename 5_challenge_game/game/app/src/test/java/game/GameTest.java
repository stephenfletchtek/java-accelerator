package game;

import java.util.ArrayList;

import static org.junit.Assert.*;
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

  @Test
  public void testGuessLetter() {
    WordChooser mockWordChooser = mock(WordChooser.class);
    when(mockWordChooser.getRandomWordFromDictionary()).thenReturn("MAKERS");
    Game game = new Game(mockWordChooser);
    assertTrue(game.guessLetter('M'));
    assertTrue(game.guessLetter('A'));
    assertFalse(game.guessLetter('B'));
    ArrayList<Character> result = new ArrayList<Character>();
    result.add('M');
    result.add('A');
    assertEquals(game.guessed, result);
    assertEquals(game.getRemainingAttempts(), Integer.valueOf(9));
  }
}
