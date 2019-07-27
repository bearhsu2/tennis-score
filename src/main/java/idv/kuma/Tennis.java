package idv.kuma;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 */
public class Tennis {

    private static Map<Integer, String> scoreToWord = new HashMap<>();

    static {
        scoreToWord.put(0, "Love");
        scoreToWord.put(1, "Fifteen");
        scoreToWord.put(2, "Thirty");
        scoreToWord.put(3, "Forty");
    }

    int aScore = 0;

    public Tennis(String aName, String bName) {

    }


    public void aHit() {
        aScore++;
    }

    public String score() {

        if (aScore >= 4) return "Tom Win";

        if (aScore == 0) return "Love All";


        return scoreToWord.get(aScore) + " Love";
    }
}
