package game;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;

public class AppTest {
    App app;

    @Before
    public void initialize() {
        WordChooser mockWordChooser = mock(WordChooser.class);
        when(mockWordChooser.getRandomWordFromDictionary()).thenReturn("MAKERS");
        app = new App(mockWordChooser);
    }

    @Test
    public void appHasAGreeting() {
        assertNotNull("app should have a greeting", app.getGreeting());
    }

    @Test
    public void dontLoseGame() {
        assertFalse("Game is not lost", app.isGameLost());
    }

    @Test
    public void doLoseGame() {
        for (int i = 0; i < 10; i++) {
            app.guessLetter('Z');
        }
        assertTrue("Game is lost", app.isGameLost());
    }

    @Test
    public void dontWinGame() {
        assertFalse("Game is not won", app.isGameWon());
    }

    @Test
    public void doWinGame() {
        app.guessLetter('M');
        app.guessLetter('A');
        app.guessLetter('K');
        app.guessLetter('E');
        app.guessLetter('R');
        app.guessLetter('S');
        assertTrue("Game is won", app.isGameWon());
    }
}
