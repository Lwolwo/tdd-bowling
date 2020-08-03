public class BowlingGame {
    public int caclScores(String[] scores) {
        int totalScores = 0;
        boolean isStriking = false;
        for (int i = 0; i < scores.length; i++) {
            String[] hits = scores[i].split("-");
            int hit1 = Integer.parseInt(hits[0]);
            int hit2 = Integer.parseInt(hits[1]);

            // 全中记录下一轮积分
            if (isStriking) {
                totalScores += 10 + (hit1 + hit2);
                isStriking = false;
                System.out.println("全中：第" + (i) + "轮得分为：" + (10 + hit1 + hit2));
            }

            if(i >= 10) {
                break;
            }

            // 前9轮补中/全中
            if (hit1 + hit2 == 10) {
                // 全中
                if (hit1 == 10) {
                    isStriking = true;
                } else {
                    totalScores += 10 + hit2;
                    System.out.println("补中：第" + (i + 1) + "轮得分为：" + (10 + hit2));
                }
            } else {
                totalScores += hit1 + hit2;
                System.out.println("第" + (i + 1) + "轮得分为：" + (hit1 + hit2));
            }

        }

        System.out.println(totalScores);
        return totalScores;
    }
}
