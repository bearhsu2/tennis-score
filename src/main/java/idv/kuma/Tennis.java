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

    private int aScore = 0;
    private int bScore = 0;

    public Tennis(String aName, String bName) {

    }


    public void aHit() {
        aScore++;
    }

    public void bHit() {
        bScore++;
    }

    public String score() {

        if (aScore >= 4 && bScore < 3) return "Tom Win";
        if (aScore >= 4 && bScore == 3) return "Tom Adv";

        if (aScore == bScore) {
            return getSameScore();
        }

        return scoreToWord.get(aScore) + " " + scoreToWord.get(bScore);
    }

    private String getSameScore() {
        if (aScore == 3)
            return "Deuce";
        else
            return scoreToWord.get(aScore) + " All";
    }
}
