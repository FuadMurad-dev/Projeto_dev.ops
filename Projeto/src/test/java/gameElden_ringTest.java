import information.Game;
import org.example.Main;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class gameElden_ringTest {

    public static Game Elden_Ring;

    @BeforeClass
    public static void setUp() {
        Main.initializeGames();
        List<Game> games = Main.getGames();
        Elden_Ring = games.stream()
                .filter(g -> g.getName().equals("Elden ring"))
                .findFirst()
                .orElse(null);
    }

    @Test
    public void testGameName() {
        assertNotNull(Elden_Ring);
        assertEquals("Elden ring", Elden_Ring.getName());
    }

    @Test
    public void testGameMusic() {
        assertEquals("org.example.Main theme", Elden_Ring.getMusic());
    }

    @Test
    public void testGameDifficulty() {
        assertEquals("HARD", Elden_Ring.getDifficulty());
    }

    @Test
    public void testGameMetaScore() {
        assertEquals(95, Elden_Ring.getMetaScore(), 0.0);
    }

    @Test
    public void testGameYear() {
        assertEquals(2022, Elden_Ring.getYear());
    }
}

