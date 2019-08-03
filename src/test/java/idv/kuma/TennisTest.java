package idv.kuma;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class TennisTest {


    @Test
    public void init_Love_All() {

        Tennis tennis = new Tennis();

        Assert.assertEquals("Love All", tennis.score());
    }

    @Test
    public void Player1_1_Fifteen_Love() {

        Tennis tennis = new Tennis();

        tennis.player1();

        Assert.assertEquals("Fifteen Love", tennis.score());
    }
}
