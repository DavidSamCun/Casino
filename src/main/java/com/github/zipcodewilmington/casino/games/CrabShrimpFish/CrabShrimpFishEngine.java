package com.github.zipcodewilmington.casino.games.CrabShrimpFish;

import com.github.zipcodewilmington.casino.Game;
import com.github.zipcodewilmington.casino.GameEngine;

import java.util.ArrayList;
import java.util.Scanner;

public class CrabShrimpFishEngine extends GameEngine {

    public CrabShrimpFishEngine(CrabShrimpFishGame game, ArrayList<CrapShrimpFishPlayer> players) {
        super(game, players);
    }

    boolean gameOver = false;
    CrabShrimpFishGame game;

    @Override
    public void start() {
        gameOver = false;
        game = new CrabShrimpFishGame();
        String choice = "";
        int bet = 0;
        Scanner in = new Scanner(System.in);
        CrapShrimpFishPlayer player = addPlayer();
        System.out.println("Welcome to CrabShrimpFish!");

        while(!gameOver){
            System.out.println("\n Please place your bets!");

            for (int i = 0; i < 6; i++){            //Bet Phase
                System.out.println("\nHow much would you like to bet on " + (i+1) + "?");
                bet = in.nextInt();
                player.setPlayerBet(i, bet);
                System.out.println("You've bet " + bet + " on "+ (i+1));
            }

            //Roll Dice
            System.out.println("\n Commencing Dice Roll!");
            game.rollDice();

            //Check Bets
            game.checkWin(player);

            //Play again?
            System.out.println("\n Would you like to play again? yes or no?");
            if(choice.equals("no")){
            exitGame();
            }

        }

    }

    @Override
    public Game getGame() {
        return new CrabShrimpFishGame();
    }

    @Override
    public void exitGame() {
    gameOver = true;
    }

    @Override
    public void replay() {

    }

    public CrapShrimpFishPlayer addPlayer(){
        CrapShrimpFishPlayer player1 = new CrapShrimpFishPlayer();
        return player1;
    }

    public void resetBet(){

    }

}
