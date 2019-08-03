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

        player1Score(1);

        check("Fifteen Love");
    }

    @Test
    public void _2_0_Thirteen_Love() {

        player1Score(2);
        check("Thirty Love");
    }

    @Test
    public void _3_0_Forty_Love() {

        player1Score(3);

        check("Forty Love");
    }

    @Test
    public void _0_1_Love_Fifteen() {

        tennis.player2Score();

        check("Love Fifteen");
    }

    private void player1Score(int times) {

        for (int i = 0; i < times; i++) {
            tennis.player1Score();

        }
    }
}
