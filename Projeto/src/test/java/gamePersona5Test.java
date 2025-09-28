import information.Game;
import org.example.Main;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class gamePersona5Test {

    public static Game Persona5;

    @BeforeClass
    public static void setUp() {
        Main.initializeGames();
        List<Game> games = Main.getGames();
        Persona5 = games.stream()
                .filter(g -> g.getName().equals("Person 5"))
                .findFirst()
                .orElse(null);
    }

    @Test
    public void testGameName() {
        assertNotNull(Persona5);
        assertEquals("Person 5", Persona5.getName());
    }

    @Test
    public void testGameMusic() {
        assertEquals("I belive", Persona5.getMusic());
    }

    @Test
    public void testGameDifficulty() {
        assertEquals("Median", Persona5.getDifficulty());
    }

    @Test
    public void testGameMetaScore() {
        assertEquals(70, Persona5.getMetaScore(), 0.0);
    }

    @Test
    public void testGameYear() {
        assertEquals(2019, Persona5.getYear());
    }
}
