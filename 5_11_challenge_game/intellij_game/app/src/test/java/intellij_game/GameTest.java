package intellij_game;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

public class GameTest {
    private Masker mockMasker = mock(Masker.class);
    private WordChooser mockWordChooser = mock(WordChooser.class);
    private Game game;
    private ArrayList<Character> result;

    @Before
    public void initialize () {
        when(mockWordChooser.getRandomWordFromDictionary()).thenReturn("MAKERS");
        game = new Game(mockWordChooser, mockMasker, "");
        result = new ArrayList<Character>();
    }

    @Test
    public void testGetWordToGuess() {
        when(mockMasker.getMaskedWord("MAKERS", result)).thenReturn("M_____");
        assertEquals(game.getWordToGuess(), "M_____");
    }

    @Test
    public void testGetWordToGuessWithAttempt() {
        when(mockMasker.getMaskedWord("MAKERS", result)).thenReturn(("M_K___"));
        result.add('K');
        game.guessLetter('K');
        assertEquals(game.getWordToGuess(),"M_K___");
    }
}
