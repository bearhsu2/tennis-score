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
        if (sameScore()) {
            return alreadyDeuce()
                    ? getDeuce()
                    : getAll();

        }

        // different scores
        return alreadyDeuce()
                ? getWinOrAdv()
                : getNormalScore();


    }

    private String getWinOrAdv() {
        return getLeaderName() +
                (differenceIsOne() ?
                        " Adv" :
                        " Win"
                );
    }

    private String getNormalScore() {
        return scoreTimesToScore.get(aScoreTimes) + " " + scoreTimesToScore.get(bScoreTimes);
    }

    private boolean sameScore() {
        return aScoreTimes == bScoreTimes;
    }

    private boolean alreadyDeuce() {
        return aScoreTimes >= 3 && bScoreTimes >= 3;
    }

    private String getAll() {
        return scoreTimesToScore.get(aScoreTimes) + " All";
    }

    private String getDeuce() {
        return "Deuce";
    }

    private String getLeaderName() {
        return aScoreTimes > bScoreTimes ? aName : bName;
    }

    private boolean differenceIsOne() {
        return Math.abs(aScoreTimes - bScoreTimes) == 1;
    }

    public void aScore() {

        aScoreTimes++;

    }

    public void bScore() {
        bScoreTimes++;
    }
}
