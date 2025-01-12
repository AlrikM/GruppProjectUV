import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class HighscoreTest {

    @Test
    public void testAddScore() {
        Highscore highscore = new Highscore();
        highscore.addScore("Olle", 5);
        highscore.addScore("Dennis", 4);

        assertEquals("Olle", highscore.scores.get(5), "The score of 5 should be associated with Olle.");
        assertEquals("Dennis", highscore.scores.get(4), "The score of 4 should be associated with Dennis");
    }

    @Test
    public void testOrderOfScores() {
        Highscore highscore = new Highscore();
        highscore.addScore("Olle", 5);
        highscore.addScore("Dennis", 4);
        highscore.addScore("Alrik", 3);

        int firstScore = highscore.scores.firstKey();
        int lastScore = highscore.scores.lastKey();

        assertEquals(5, firstScore, "The highest score should be 5.");
        assertEquals(3, lastScore, "The lowest score should be 3.");
    }

}