package idv.kuma;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TennisTest {

    private Tennis tennis;


    @Before
    public void setUp() throws Exception {
        tennis = new Tennis("Tom", "Joe");
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

    @Test
    public void _3_0_Forty_love() {

        aScore(3);

        check("Forty Love");
    }


    @Test
    public void _0_1_love_fifteen() {

        bScore(1);
        check("Love Fifteen");
    }


    @Test
    public void _1_1_fifteen_all() {

        aScore(1);
        bScore(1);

        check("Fifteen All");
    }

    @Test
    public void _3_3_fifteen_all() {

        makeDeuce();

        check("Deuce");
    }

    private void makeDeuce() {
        aScore(3);
        bScore(3);
    }

    @Test
    public void _4_3_Player_1_Adv() {

        makeDeuce();

        aScore(1);

        check("Tom Adv");
    }


    @Test
    public void _5_3_Player_1_Win() {

        makeDeuce();

        aScore(2);

        check("Tom Win");
    }

    @Test
    public void _3_4_Player_2_Adv() {

        makeDeuce();

        bScore(1);

        check("Joe Adv");
    }

    @Test
    public void _3_5_Player_2_Win() {

        makeDeuce();

        bScore(2);

        check("Joe Win");
    }

    private void bScore(int num) {
        for (int i = 0; i < num; i++) {
            tennis.bScore();

        }
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
