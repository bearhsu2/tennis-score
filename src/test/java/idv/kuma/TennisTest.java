package idv.kuma;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class TennisTest {

    private Tennis tennis;

    @Test
    public void When_0_0_Then_Love_All() {

        tennis = new Tennis("Tom", "Joe");

        Assert.assertEquals("Love All", tennis.score());
    }

    @Test
    public void When_1_0_Then_Fifteen_Love() {


        tennis = new Tennis("Tom", "Joe");

        aHits(1);

        Assert.assertEquals("Fifteen Love", tennis.score());
    }

    @Test
    public void When_2_0_Then_Thirty_Love() {


        tennis = new Tennis("Tom", "Joe");

        aHits(2);
        Assert.assertEquals("Thirty Love", tennis.score());
    }

    @Test
    public void When_3_0_Then_Forty_Love() {


        tennis = new Tennis("Tom", "Joe");

        aHits(3);

        Assert.assertEquals("Forty Love", tennis.score());
    }


    @Test
    public void When_4_0_Then_Tom_Win() {


        tennis = new Tennis("Tom", "Joe");

        aHits(4);

        Assert.assertEquals("Tom Win", tennis.score());
    }

    @Test
    public void When_0_1_Then_Love_Fifteen() {

        tennis = new Tennis("Tom", "Joe");

        tennis.bHit();

        Assert.assertEquals("Love Fifteen", tennis.score());
    }


    private void aHits(int nums) {
        for (int i = 0; i < nums; i++) {
            tennis.aHit();
        }
    }

}
