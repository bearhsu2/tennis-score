package idv.kuma;

public class Tennis {


    private int score1 = 0;

    public String score() {

        if (score1 > 0) {
            return "Fifteen Love";
        }

        return "Love All";
    }

    public void player1Score() {
        score1++;

    }
}