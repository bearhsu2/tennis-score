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


    private String aName;
    private String bName;

    private int aScore = 0;
    private int bScore = 0;


    public Tennis(String aName, String bName) {

        this.aName = aName;
        this.bName = bName;

    }


    public void aHit() {
        aScore++;
    }

    public void bHit() {
        bScore++;

    }

    public String score() {

        if (aScore >= 4 && bScore < 3) return aName + " Win";

        if (aScore >= 3 && bScore >= 3) {
            if (Math.abs(aScore - bScore) == 1) {
                return getAdv();
            } else if (Math.abs(aScore - bScore) >= 2) {
                return "Joe Win";
            } else {
                return "Deuce";
            }


        }

        if (aScore == bScore) return getSameScore();


        return scoreToWord.get(aScore) + " " + scoreToWord.get(bScore);

    }

    private String getAdv() {
        if (aScore > bScore) {
            return aName + " Adv";
        } else {
            return bName + " Adv";
        }
    }

    private String getSameScore() {


        return scoreToWord.get(aScore) + " All";
    }
}
