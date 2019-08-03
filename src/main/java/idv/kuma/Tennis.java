package idv.kuma;

import java.util.HashMap;
import java.util.Map;

public class Tennis {

    private static Map<Integer, String> scoreToPresent = new HashMap<>();

    static {
        scoreToPresent.put(0, "Love");
        scoreToPresent.put(1, "Fifteen");
        scoreToPresent.put(2, "Thirty");
        scoreToPresent.put(3, "Forty");
    }

    private String name1;
    private String name2;
    private int score1 = 0;
    private int score2 = 0;

    public Tennis(String name1, String name2) {
        this.name1 = name1;
        this.name2 = name2;
    }

    public String score() {

        if (sameScore()) {
            return score1 >= 3
                    ? "Deuce"
                    : scoreToPresent.get(score1) + " All";
        }

        if (score1 >= 3 && score2 >= 3) {


            return Math.abs(score1 - score2) == 1
                    ? getAdvString()
                    : getWinString();


        }


        return scoreToPresent.get(score1) + " " + scoreToPresent.get(score2);

    }

    private String getWinString() {
        return (score1 > score2
                ? name1
                : name2) + " Win";
    }

    private String getAdvString() {
        return (score1 > score2
                ? name1
                : name2) + " Adv";
    }

    private boolean sameScore() {
        return score1 == score2;
    }

    public void player1Score() {
        score1++;

    }

    public void player2Score() {
        score2++;
    }
}