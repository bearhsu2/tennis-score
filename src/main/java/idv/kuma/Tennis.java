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


    private int score1 = 0;
    private int score2 = 0;

    public String score() {

        if (score1 == score2) {
            if (score1 == 3) {
                return "Deuce";
            } else {
                return scoreToPresent.get(score1) + " All";
            }
        }

        return scoreToPresent.get(score1) + " " + scoreToPresent.get(score2);

    }

    public void player1Score() {
        score1++;

    }

    public void player2Score() {
        score2++;
    }
}