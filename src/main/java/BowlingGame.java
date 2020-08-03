public class BowlingGame {
    public int caclScores(int[] scores) {
        int tot = 0;
        int line = 1;
        boolean nextFrame = false;
        int frameTot = 0;
        for (int i = 0; i < scores.length; i++) {
            frameTot += scores[i];

            if (nextFrame) {
                nextFrame = false;
                // 补中情况
                if (frameTot == 10) {
                    tot += 10 + scores[i];
                } else {
                    tot += scores[i] + scores[i - 1];
                }

                frameTot = 0;
                line++;
            } else {
                nextFrame = true;
            }

        }
        System.out.println(tot);
        return tot;
    }
}
