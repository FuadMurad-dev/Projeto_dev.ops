import information.Game;
import org.example.Main;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class gameExpeditionTest {

    private static Game expedition;

    @BeforeClass
    public static void setUp()
    {
        Main.initializeGames();
        List<Game> games = Main.getGames();
        expedition = games.stream()
                .filter(game -> game.getName().equals("Expedition 33"))
                .findFirst()
                .orElse(null);
    }


    @Test
    public void testGameName() {
        assertNotNull(expedition);
        assertEquals("Expedition 33", expedition.getName());
    }

    @Test
    public void testGameMusic() {
        assertEquals("Lumiere", expedition.getMusic());
    }

    @Test
    public void testGameDifficulty() {
        assertEquals("HARD", expedition.getDifficulty());
    }

    @Test
    public void testGameMetaScore() {
        assertEquals(99, expedition.getMetaScore(), 0.0);
    }

    @Test
    public void testGameYear() {
        assertEquals(2025, expedition.getYear());
    }
}