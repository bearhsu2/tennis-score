package idv.kuma;

import java.util.HashMap;
import java.util.Map;

public class Tennis {

    private static Map<Integer, String> scoreToString = new HashMap<>();

    static {
        scoreToString.put(1, "Fifteen");
        scoreToString.put(2, "Thirty");
    }

    private int a;

    public String getScore() {

        if (a == 1) {
            return scoreToString.get(a) + " Love";
        }

        if (a == 2) {
            return scoreToString.get(a) + " Love";
        }

        return "Love All";
    }

    public void aScore() {

        a++;

    }
}
