package idv.kuma;

import java.util.HashMap;
import java.util.Map;

public class Tennis {

    private static Map<Integer, String> scoreTimesToScore = new HashMap<>();

    static {
        scoreTimesToScore.put(0, "Love");
        scoreTimesToScore.put(1, "Fifteen");
        scoreTimesToScore.put(2, "Thirty");
        scoreTimesToScore.put(3, "Forty");
    }

    private int aScoreTimes = 0;
    private int bScoreTimes = 0;

    public String getScore() {


        if (aScoreTimes == bScoreTimes) {

            return scoreTimesToScore.get(aScoreTimes) + " All";
        }

        return scoreTimesToScore.get(aScoreTimes) + " " + scoreTimesToScore.get(bScoreTimes);

    }

    public void aScore() {

        aScoreTimes++;

    }

    public void bScore() {
        bScoreTimes++;
    }
}
