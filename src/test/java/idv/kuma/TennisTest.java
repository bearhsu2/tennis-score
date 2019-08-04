package idv.kuma;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TennisTest {

    private Tennis tennis;


    @Before
    public void setUp() throws Exception {
        tennis = new Tennis();
    }

    @Test
    public void init_love_all() {


        check("Love All");
    }

    @Test
    public void _1_0_fifteen_love() {

        aScore(1);
        check("Fifteen Love");
    }

    @Test
    public void _2_0_thirty_love() {

        aScore(2);

        check("Thirty Love");
    }


    private void check(String s) {
        Assert.assertEquals(s, tennis.getScore());
    }

    private void aScore(int num) {
        for (int i = 0; i < num; i++) {
            tennis.aScore();
        }
    }
}
