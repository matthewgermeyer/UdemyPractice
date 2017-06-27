package com.example;

/**
 * Created by MattyG on 6/26/17.
 */
public class HighScore {

    public static void main(String[] args) {

        displayHighScorePosition("Randy", calculateHighScorePosition(99));

        displayHighScorePosition("Matt", calculateHighScorePosition(1500));

        displayHighScorePosition("Brock", calculateHighScorePosition(501));

        displayHighScorePosition("Cecile", calculateHighScorePosition(450));



    }


    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + " managed to get into positon " + position + " on the high score table!");
    }

    public static int calculateHighScorePosition(int score){
        if (score >= 1000){
            return 1;
        }
        if (score >= 500 && score < 1000){
            return 2;
        }
        if (score >= 100 && score < 500){
            return 3;
        } else {
            return 4;
        }
    }
}
