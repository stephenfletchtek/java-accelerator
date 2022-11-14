package intellij_game;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;

public class AppTest {
    private App app;

    @Before
    public void initialize() {
        WordChooser mockWordChooser = mock(WordChooser.class);
        Masker mockMasker = mock(Masker.class);
        app = new App(mockWordChooser, mockMasker, new String[] { "", "" });
    }

    @Test
    public void appHasAGreeting() {
        assertNotNull("app should have a greeting", app.displayGreeting(0));
    }
}
