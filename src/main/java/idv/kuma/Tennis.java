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
    private String aName;

    public Tennis(String aName) {
        this.aName = aName;
    }

    public String getScore() {


        // same scores
        if (aScoreTimes == bScoreTimes) {

            return aScoreTimes >= 3
                    ? "Deuce"
                    : scoreTimesToScore.get(aScoreTimes) + " All";

        }


        // different scores

        if (aScoreTimes >= 3 && bScoreTimes >= 3) {
            return aName + " Adv";
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
