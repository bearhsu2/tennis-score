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

        tennis.aScore();

        Assert.assertEquals("Fifteen Love", tennis.getScore());
    }

    @Test
    public void _2_0_thirty_love() {

        tennis.aScore();
        tennis.aScore();

        Assert.assertEquals("Thirty Love", tennis.getScore());
    }
}
