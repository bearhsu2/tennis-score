package idv.kuma;

public class Tennis {


    private int score1 = 0;

    public String score() {

        if (score1 == 1) {
            return "Fifteen Love";
        } else if (score1 == 2) {
            return "Thirty Love";
        }

        return "Love All";
    }

    public void player1Score() {
        score1++;

    }
}