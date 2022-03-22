package com.github.zipcodewilmington.casino.games.roulette;

import com.github.zipcodewilmington.casino.GamblingInterface;
import com.github.zipcodewilmington.casino.Game;

import java.util.*;

public class RouletteGame extends Game<Integer,Boolean> implements GamblingInterface {
    public static int betCondition = 0;
    static Integer winningNumber;
    public boolean isThereaWinner = false;

    // Take bet

    public int takeBet(){
        int betAmount;
        Scanner scanner = new Scanner(System.in);
         try{
        System.out.println("Please enter how much you want to bet: ");
        return betAmount = scanner.nextInt();

          }catch (InputMismatchException e){
           System.out.println(" "+scanner.next()+ " isn't a number!");
          }
        String bet="";
        switch(bet) {
            case "00": betCondition = 1;
            break;
            case "0": betCondition =2;
            break;
            case "1": betCondition =3;// choose by number
            break;
            case "2": betCondition =4;//choose high
            break;
            case "3": betCondition = 5;//choose low
            break;
            case "4": betCondition = 6;//choose even
            break;
            case "5": betCondition = 7;//choose odd
            break;
      }
      return 0;
    }
    // update person funds
    public void payOut(RoulettePlayer player, int betAmount){
       int x =  player.getFunds();
       int y = betAmount * 2;
       player.setFunds(x+y);

    }
    // make sure there are still funds left to bet
    public Boolean checkFunds(RoulettePlayer player, int betAmount){
        if (player.getFunds()== 0)
            return false;
            //kick out of game and back to casino
        if (player.getFunds() >= betAmount){
            return true;
            //player can continue
        }
        return false;
    }
    //see if bet was won?
    private static boolean betWon(int bet){
        if(winningNumber == bet)
            return true;
        return false;
    }
    // Random number generator
    // numbers from 0 to
    // win if red or black 0 or 00

    public boolean isWinner(){
       // return betWon(bet);

            return true;
    }


    //players take turns
    public Integer turn(Integer wheel, Boolean marker){
        Random rand = new Random();
        winningNumber = rand.nextInt(36);
        return winningNumber;
    }
}
