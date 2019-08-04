package idv.kuma;

public class Tennis {


    private int a;

    public String getScore() {

        if (a>0) {
            return "Fifteen Love";
        }
        return "Love All";
    }

    public void aScore() {

        a++;

    }
}
