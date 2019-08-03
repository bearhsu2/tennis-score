package idv.kuma;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class TennisTest {


    private Tennis tennis;

    @Before
    public void setUp() throws Exception {
        this.tennis = new Tennis();

    }

    @Test
    public void init_Love_All() {

        check("Love All");
    }

    private void check(String s) {
        Assert.assertEquals(s, tennis.score());
    }

    @Test
    public void _1_0_Fifteen_Love() {

        tennis.player1Score();

        check("Fifteen Love");
    }

    @Test
    public void _2_0_Thirteen_Love() {

        tennis.player1Score();
        tennis.player1Score();

        check("Thirty Love");
    }

    @Test
    public void _3_0_Forty_Love() {

        tennis.player1Score();
        tennis.player1Score();
        tennis.player1Score();

        check("Forty Love");
    }
}
