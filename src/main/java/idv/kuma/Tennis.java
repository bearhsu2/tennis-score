package idv.kuma;

/**
 * Hello world!
 */
public class Tennis {

    int tomScore = 0;

    public void hit(String name) {
        tomScore++;
    }

    public String score() {


        if (tomScore == 0) {
            return "Love All";
        } else return "Fifteen Love";
    }
}
