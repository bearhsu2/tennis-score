package idv.kuma;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class TennisTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void When_0_0_Then_Love_All()
    {

        Tennis tennis = new Tennis();

        Assert.assertEquals("Love All", tennis.score());
    }
}
