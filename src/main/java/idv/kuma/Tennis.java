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

        if (score1 > score2 && score2 >= 3) {

            if (score1 - score2 == 1) {
                return name1 + " Adv";
            } else {
                return name1 + " Win";
            }

        }

        if (score2 > score1 && score1 >= 3) {
            return score2 - score1 == 1
                    ? name2 + " Adv"
                    : name2 + " Win";
        }


        return scoreToPresent.get(score1) + " " + scoreToPresent.get(score2);

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