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

    int tomScore = 0;


    public void hit(String name) {
        tomScore++;
    }

    public String score() {


        if (tomScore == 0) {
            return "Love All";


        } else return scoreToWord.get(tomScore) +" Love";
    }
}
