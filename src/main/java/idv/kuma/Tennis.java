package idv.kuma;

import java.util.HashMap;
import java.util.Map;

public class Tennis {

    private static Map<Integer, String> scoreTimesToScore = new HashMap<>();

    static {
        scoreTimesToScore.put(1, "Fifteen");
        scoreTimesToScore.put(2, "Thirty");
    }

    private int aScoreTimes = 0;

    public String getScore() {


        if (aScoreTimes > 0) {
            return scoreTimesToScore.get(aScoreTimes) + " Love";

        }

        return "Love All";
    }

    public void aScore() {

        aScoreTimes++;

    }
}
