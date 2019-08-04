package idv.kuma;

public class Tennis {


    private int a;

    public String getScore() {

        if (a == 1) {
            return "Fifteen Love";
        }

        if (a == 2) {
            return "Thirty Love";
        }
        
        return "Love All";
    }

    public void aScore() {

        a++;

    }
}
