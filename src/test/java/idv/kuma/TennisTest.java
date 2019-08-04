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


        Assert.assertEquals("Love All", tennis.getScore());
    }

    @Test
    public void _1_0_fifteen_love() {

        aScore(1);
        Assert.assertEquals("Fifteen Love", tennis.getScore());
    }

    @Test
    public void _2_0_thirty_love() {

        aScore(2);

        Assert.assertEquals("Thirty Love", tennis.getScore());
    }

    private void aScore(int num) {
        for (int i = 0; i < num; i++) {

            tennis.aScore();
        }
    }
}
