import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {
    @Test
    void should_get_scores_when_every_frame_no_strike_and_spare() {
        int[] scores = { 1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 4 };
        int result = new BowlingGame().caclScores(scores);
        assertEquals(82, result);
    }
}
