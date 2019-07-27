package idv.kuma;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class TennisTest
{

    @Test
    public void When_0_0_Then_Love_All()
    {

        Tennis tennis = new Tennis("Tom", "Joe");

        Assert.assertEquals("Love All", tennis.score());
    }

    @Test
    public void When_1_0_Then_Fifteen_Love()
    {


        Tennis tennis = new Tennis("Tom", "Joe");

        tennis.aHit();

        Assert.assertEquals("Fifteen Love", tennis.score());
    }

    @Test
    public void When_2_0_Then_Thirty_Love()
    {


        Tennis tennis = new Tennis("Tom", "Joe");

        tennis.aHit();
        tennis.aHit();

        Assert.assertEquals("Thirty Love", tennis.score());
    }

    @Test
    public void When_3_0_Then_Forty_Love()
    {


        Tennis tennis = new Tennis("Tom", "Joe");

        tennis.aHit();
        tennis.aHit();
        tennis.aHit();

        Assert.assertEquals("Forty Love", tennis.score());
    }

}
