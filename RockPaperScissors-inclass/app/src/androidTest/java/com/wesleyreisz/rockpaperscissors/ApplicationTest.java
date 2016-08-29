package com.wesleyreisz.rockpaperscissors;

import android.app.Application;
import android.test.ApplicationTestCase;

import com.wesleyreisz.rockpaperscissors.Game.GameUtils;

import junit.framework.Assert;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
    }
    /*
    TODO: Implement test logic to test the random number generator.
    */
    public void testRandomResultGenerator(){
        Integer computerChoice = GameUtils.getComputerChoice();
        Assert.assertEquals(Integer.toString(R.id.btnRock), Integer.toString(computerChoice));
    }

    /*
    TODO: Implement the logic to make this test case pass.
     */
    public void testScissors(){
        Integer player = R.id.btnScissors;

        Assert.assertEquals(GameUtils.BEATS,GameUtils.evaluateWinner(player,R.id.btnPaper));
        Assert.assertEquals(GameUtils.TIES,GameUtils.evaluateWinner(player, R.id.btnScissors));
        Assert.assertEquals(GameUtils.LOSES_TO,GameUtils.evaluateWinner(player,R.id.btnRock));

        Assert.assertNotSame(GameUtils.TIES, GameUtils.evaluateWinner(player, R.id.btnPaper));
    }

    /*
        TODO: Implement the following logic
    */
    public void testRock(){
       assertTrue(false);
    }
    /*
        TODO: Implement the following logic
    */
    public void testPaper(){
        assertTrue(false);
    }

}
