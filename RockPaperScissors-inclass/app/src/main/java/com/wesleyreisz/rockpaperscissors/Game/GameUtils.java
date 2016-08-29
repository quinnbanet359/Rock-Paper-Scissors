package com.wesleyreisz.rockpaperscissors.Game;

import android.graphics.Color;

import com.wesleyreisz.rockpaperscissors.Game.GameType;
import com.wesleyreisz.rockpaperscissors.Game.Paper;
import com.wesleyreisz.rockpaperscissors.Game.Rock;
import com.wesleyreisz.rockpaperscissors.Game.Scissors;
import com.wesleyreisz.rockpaperscissors.R;

/**
 * Created by wesleyreisz on 9/13/15.
 */
public class GameUtils {
    public static final String BEATS = "beats";
    public static final String LOSES_TO = "loses to";
    public static final String TIES = "ties";

    public static Integer getComputerChoice(){
        /*
        TODO: Implement a random number generator that returns of of the three games options.
         */
        return  R.id.btnRock;
    }

    public static String evaluateWinner(Integer playerSelectedChoice, Integer computerSelectedChoice) {
        /*
         TODO: Create an Interface that has a super type method named eval.
         TODO: Create classes that implement the interface.
         TODO: Based on playerChoice, create an instance of that object (IE Rock)
         TODO: Call the eval method on that object passing in the computer's choice.
         TODO: Implement the logic for each of the game types to determine the winner.
         */

        //logic goes here

        return GameUtils.BEATS;
    }

    public static Integer convertButtonToImage(Integer buttonChoice) {
        if(buttonChoice==R.id.btnRock){
            return R.drawable.rock;
        }else if (buttonChoice==R.id.btnPaper){
            return R.drawable.paper;
        }else{
            return R.drawable.scissors;
        }
    }

    public static int defineTextColor(String msg) {
        if(GameUtils.LOSES_TO.equalsIgnoreCase(msg)){
            return Color.RED;
        }else if(GameUtils.BEATS.equalsIgnoreCase(msg)){
            return Color.GREEN;
        }else{
            return Color.BLACK;
        }
    }
}

