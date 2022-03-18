package com.github.zipcodewilmington.casino.games.roulette;

import com.github.zipcodewilmington.casino.GamblingInterface;
import com.github.zipcodewilmington.casino.Game;

import java.util.ArrayList;

public class RouletteGame extends Game implements GamblingInterface {
    ArrayList<Integer> wheel = new ArrayList<>();

    // Take bet
    public static void takeBet(){
        String bet="";
        switch(bet) {
            case "00": ;
            break;
            case "0":
            break;
            case "1": // choose by number
            break;
            case "2": //choose high
            break;
            case "3": //choose low
            break;
            case "4": //choose even
            break;
            case "5": //choose odd
            break;
      }
    }
    // update person funds
    public static void payOut(){

    }
    // make sure there are still funds left to bet
    public static void checkFunds(){

    }
    //see if bet was won?
    public static void betWon(){}
    // Random number generator
    // numbers from 0 to
    // win if red or black 0 or 00
    public boolean isWinner(){
        return false;
    }
    //players take turns
    public String turn(int[] move){

        return null;
    }
}
