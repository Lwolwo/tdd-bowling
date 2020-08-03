import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {
    @Test
    void should_get_scores_when_every_frame_not_strike_and_spare() {
        String[] scores = { "1-2", "3-4", "1-2", "3-4", "1-2", "3-4", "1-2", "3-4","1-2", "3-4"};

        int result = new BowlingGame().caclScores(scores);
        assertEquals(50, result);
    }

    @Test
    void should_get_scores_when_not_last_frame_spare_and_not_strike() {
        String[] scores = { "1-9", "8-2", "1-2", "3-4", "1-2", "3-4", "1-2", "3-4", "1-2", "3-4" };
        int result = new BowlingGame().caclScores(scores);
        assertEquals(71, result);
    }

    @Test
    void should_get_scores_when_not_last_frame_strike_and_not_spare() {
        String[] scores = { "10-0", "2-5", "1-2", "3-4", "1-2", "3-4", "1-2", "3-4", "1-2", "3-4" };
        int result = new BowlingGame().caclScores(scores);
        assertEquals(64, result);
    }

    @Test
    void should_get_scores_when_not_last_frame_strike_and_spare() {
        String[] scores = { "10-0", "5-5", "1-2", "3-4", "1-2", "3-4", "1-2", "3-4", "1-2", "3-4" };
        int result = new BowlingGame().caclScores(scores);
        assertEquals(75, result);
    }

    @Test
    void should_get_scores_when_last_frame_strike() {
        String[] scores = { "0-0", "0-0", "0-0", "0-0", "0-0", "0-0", "0-0", "0-0", "0-0", "10-0", "1-3" };
        int result = new BowlingGame().caclScores(scores);
        assertEquals(14, result);
    }

    @Test
    void should_get_scores_when_last_frame_spare() {
        String[] scores = { "0-0", "0-0", "0-0", "0-0", "0-0", "0-0", "0-0", "0-0", "0-0", "3-7", "5-0" };
        int result = new BowlingGame().caclScores(scores);
        assertEquals(15, result);
    }

}
