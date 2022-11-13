package game;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;

public class AppTest {
    private App app;
    private WordChooser mockWordChooser;
    private Masker mockMasker;

    @Before
    public void initialize() {
        mockWordChooser = mock(WordChooser.class);
        mockMasker = mock(Masker.class);
        app = new App(mockWordChooser, mockMasker);
    }

    @Test
    public void appHasAGreeting() {
        assertNotNull("app should have a greeting", app.displayGreeting(0));
    }
}
