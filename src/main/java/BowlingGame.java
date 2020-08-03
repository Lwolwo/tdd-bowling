public class BowlingGame {
    public int caclScores(int[] scores) {
        int tot = 0;
        for (int i = 0; i < scores.length; i++) {
            tot += scores[i];
        }
        System.out.println(tot);
        return tot;
    }
}
