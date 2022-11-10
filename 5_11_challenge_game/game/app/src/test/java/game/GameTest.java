package game;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

public class GameTest {
  WordChooser mockWordChooser = mock(WordChooser.class);
  Game game;
  ArrayList<Character> result;

  @Before
  public void initialize() {
    when(mockWordChooser.getRandomWordFromDictionary()).thenReturn("MAKERS");
    game = new Game(mockWordChooser);
    result = new ArrayList<Character>();
  }

  @Test
  public void testGetWordToGuess() {
    assertEquals(game.getWordToGuess(), "M_____");
  }

  @Test
  public void testRightLetters() {
    assertTrue(game.guessLetter('M'));
    assertTrue(game.guessLetter('A'));
    result.add('M');
    result.add('A');
    assertEquals(game.getGuessed(), result);
    assertEquals(game.getRemainingAttempts(), Integer.valueOf(10));
  }

  @Test
  public void guessWrongLetter() {
    assertFalse(game.guessLetter('B'));
    assertEquals(game.getGuessed(), result);
    assertEquals(game.getRemainingAttempts(), Integer.valueOf(9));
  }
}
