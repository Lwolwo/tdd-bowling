import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {
    @Test
    void should_get_scores_when_every_frame_no_strike_and_spare() {
        int[] scores = { 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4 };
        int result = new BowlingGame().caclScores(scores);
        assertEquals(50, result);
    }

    @Test
    void should_get_scores_when_not_last_frame_spare_and_no_strike() {
        int[] scores = { 1, 9, 8, 2, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4 };
        int result = new BowlingGame().caclScores(scores);
        assertEquals(71, result);
    }
}
