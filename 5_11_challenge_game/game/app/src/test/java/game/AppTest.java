package game;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;

public class AppTest {
    App app;
    WordChooser mockWordChooser;

    @Before
    public void initialize() {
        mockWordChooser = mock(WordChooser.class);
        when(mockWordChooser.getRandomWordFromDictionary()).thenReturn("MAKERS");
        app = new App(mockWordChooser);
    }

    @Test
    public void appHasAGreeting() {
        assertNotNull("app should have a greeting", app.getGreeting());
    }
}
