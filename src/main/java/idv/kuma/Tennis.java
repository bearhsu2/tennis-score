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
    private String bName;

    public Tennis(String aName, String bName) {
        this.aName = aName;
        this.bName = bName;
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
            if (aScoreTimes > bScoreTimes) {

                if (aScoreTimes - bScoreTimes == 1) {
                    return aName + " Adv";
                } else {
                    return aName + " Win";
                }
            } else {
                return bName +" Adv";
            }
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
