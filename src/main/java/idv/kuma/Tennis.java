package idv.kuma;

import java.util.HashMap;
import java.util.Map;

public class Tennis {

    private static Map<Integer, String> scroeToPresent = new HashMap<>();

    static {
        scroeToPresent.put(1, "Fifteen");
        scroeToPresent.put(2, "Thirty");
    }


    private int score1 = 0;

    public String score() {

        if (score1 > 0) {
            return scroeToPresent.get(score1) + " Love";
        }

        return "Love All";
    }

    public void player1Score() {
        score1++;

    }
}