
import information.Game;
import org.example.Main;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;


public class gameStarWarsTest {

    public static Game StarWars;

    @BeforeClass
    public static void setUp() {
        Main.initializeGames();
        List<Game> games = Main.getGames();
        StarWars = games.stream()
                .filter(g -> g.getName().equals("STAR WARS: A GUERRA DOS CLONES"))
                .findFirst()
                .orElse(null);
    }

    @Test
    public void testGameName() {
        assertNotNull(StarWars);
        assertEquals("STAR WARS: A GUERRA DOS CLONES", StarWars.getName());
    }

    @Test
    public void testGameMusic() {
        assertEquals("DUEL OF FATES", StarWars.getMusic());
    }

    @Test
    public void testGameDifficulty() {
        assertEquals("HARD", StarWars.getDifficulty());
    }

    @Test
    public void testGameMetaScore() {
        assertEquals(88, StarWars.getMetaScore(), 0.0);
    }

    @Test
    public void testGameYear() {
        assertEquals(2008, StarWars.getYear());
    }
}
