package com.wesleyreisz.rockpaperscissors.Game;

import android.graphics.Color;
import android.util.Log;

import com.wesleyreisz.rockpaperscissors.R;

import java.util.Random;

/**
 * Created by wesleyreisz on 9/13/15.
 */
public class GameUtils {
    public static final String BEATS = "beats";
    public static final String LOSES_TO = "loses to";
    public static final String TIES = "ties";

    public static Integer getComputerChoice(){

        Random rand = new Random();

        int n = rand.nextInt(3) + 1;
        if(n==1){
            return R.id.btnPaper;
        }else if(n==2){
            return R.id.btnRock;
        }else{
            return R.id.btnScissors;
        }

    }

    public static String evaluateWinner(Integer playerSelectedChoice, Integer computerSelectedChoice) {
        /*
        R.id.btnRock;
        R.id.btnScissors;
        R.id.btnPaper;
        */

        // Get playerSelectedChoice
        if (playerSelectedChoice == R.id.btnRock) {
            playerSelectedChoice = R.id.btnRock;
            Log.d("Player", "player selected rock");
        } else if (playerSelectedChoice == R.id.btnPaper) {
            playerSelectedChoice = R.id.btnPaper;
            Log.d("Player", "player selected paper");
        } else {
            playerSelectedChoice = R.id.btnScissors;
            Log.d("Player", "player selected scissors");
        }

        // Get computerSelectedChoice
        if (computerSelectedChoice == R.id.btnRock) {
            computerSelectedChoice = R.id.btnRock;
            Log.d("Comp", "comp selected rock");
        } else if (computerSelectedChoice == R.id.btnPaper) {
            computerSelectedChoice = R.id.btnPaper;
            Log.d("Comp", "comp selected paper");
        } else {
            computerSelectedChoice = R.id.btnScissors;
            Log.d("Comp", "comp selected scissors");
        }

        //TODO: Create some logic to evaluate winner.
        // ----------------------- Game Logic ----------------------
        String resultVar = "";
        // Rock Logic
        if (playerSelectedChoice == R.id.btnRock && computerSelectedChoice == R.id.btnRock) {
            Log.d("Result", "TIE, both selected Rock");
            resultVar = "TIE";
        }
        if (playerSelectedChoice == R.id.btnRock && computerSelectedChoice == R.id.btnPaper) {
            Log.d("Result", "LOSE, user lost");
            resultVar = "LOSE";
        }
        if (playerSelectedChoice == R.id.btnRock && computerSelectedChoice == R.id.btnScissors) {
            Log.d("Result", "WIN, user wins");
            resultVar = "WIN";
        }
        // Paper Logic
        if (playerSelectedChoice == R.id.btnPaper && computerSelectedChoice == R.id.btnRock) {
            Log.d("Result", "WIN, user wins");
            resultVar = "WIN";
        }
        if (playerSelectedChoice == R.id.btnPaper && computerSelectedChoice == R.id.btnPaper) {
            Log.d("Result", "TIE, both selected paper");
            resultVar = "TIE";
        }
        if (playerSelectedChoice == R.id.btnPaper && computerSelectedChoice == R.id.btnScissors) {
            Log.d("Result", "LOSE, user lost");
            resultVar = "LOSE";
        }
        // Scissors Logic
        if (playerSelectedChoice == R.id.btnScissors && computerSelectedChoice == R.id.btnRock) {
            Log.d("Result", "LOSE, user lost");
            resultVar = "LOSE";
        }
        if (playerSelectedChoice == R.id.btnScissors && computerSelectedChoice == R.id.btnPaper) {
            Log.d("Result", "WIN, user wins");
            resultVar = "WIN";
        }
        if (playerSelectedChoice == R.id.btnScissors && computerSelectedChoice == R.id.btnScissors) {
            Log.d("Result", "TIE, both selected scissors");
            resultVar = "TIE";
        }

        /*
        These are the constants that should be returned
        GameUtils.BEATS;
        GameUtils.TIES;
        GameUtils.LOSES_TO;
        */

        if (resultVar == "WIN") {
            resultVar = GameUtils.BEATS;
        }
        else if (resultVar == "LOSE") {
            resultVar = GameUtils.LOSES_TO;
        }
        else if (resultVar == "TIE"){
            resultVar = GameUtils.TIES;
        }

        return resultVar;
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

