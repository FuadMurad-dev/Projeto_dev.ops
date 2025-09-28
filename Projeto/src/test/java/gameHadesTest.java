import information.Game;
import org.example.Main;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class gameHadesTest {

    private static Game hades;

    @BeforeClass
    public static void setUp() {
        Main.initializeGames();
        List<Game> games = Main.getGames();
        hades = games.stream()
                .filter(g -> g.getName().equals("Hades"))
                .findFirst()
                .orElse(null);
    }

    @Test
    public void testGameName() {
        assertNotNull(hades);
        assertEquals("Hades", hades.getName());
    }

    @Test
    public void testGameMusic() {
        assertEquals("org.example.Main theme", hades.getMusic());
    }

    @Test
    public void testGameDifficulty() {
        assertEquals("HARD", hades.getDifficulty());
    }

    @Test
    public void testGameMetaScore() {
        assertEquals(90, hades.getMetaScore(), 0.0);
    }

    @Test
    public void testGameYear() {
        assertEquals(2016, hades.getYear());
    }
}
