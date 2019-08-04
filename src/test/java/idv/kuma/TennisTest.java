package idv.kuma;

import org.junit.Assert;
import org.junit.Test;


public class TennisTest {

    @Test
    public void init_love_all() {

        Tennis tennis = new Tennis();

        Assert.assertEquals("Love All", tennis.getScore());
    }
}
