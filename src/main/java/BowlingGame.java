public class BowlingGame {
    public int caclScores(String[] scores) {
        int totalScores = 0;
        int frameTotal = 0;
        boolean isStriking = false;
        for (int i = 0; i < scores.length; i++) {
            String[] hits = scores[i].split("-");
            int hit1 = Integer.parseInt(hits[0]);
            int hit2 = Integer.parseInt(hits[1]);

            // 全中记录下一轮积分
            if (isStriking) {
                totalScores += 10 + (hit1 + hit2);
                isStriking = false;
            }

            // 前9轮补中/全中
            if (hit1 + hit2 == 10) {
                // 全中
                if (hit1 == 10) {
                    isStriking = true;
                } else {
                    totalScores += 10 + hit2;
                }
            } else {
                totalScores += hit1 + hit2;
            }

            frameTotal = 0;
        }

        System.out.println(totalScores);
        return totalScores;
    }
}
