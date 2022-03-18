package com.github.zipcodewilmington.casino.games.blackjack;

import com.github.zipcodewilmington.casino.Game;
import com.github.zipcodewilmington.casino.GameEngine;
import com.github.zipcodewilmington.casino.Person;
import com.github.zipcodewilmington.casino.games.tictactoe.TicTacToeGame;
import com.github.zipcodewilmington.casino.games.tictactoe.TicTacToePlayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BlackJackEngine extends GameEngine {

    Scanner in = new Scanner(System.in);

    public BlackJackEngine(BlackJackGame game, ArrayList<BlackJackPlayer> players) {
        super(game, players);
    }


    boolean gameOver = false;
    //Game blackJack = getGame();
    BlackJackGame blackJack = new BlackJackGame();

    @Override
    public void start() {
        gameOver = false;
    }

    @Override
    public Game getGame() {
        return new BlackJackGame();
    }

    @Override
    public void exitGame() {
        gameOver = true;
    }

    @Override
    public void replay() {

    }


    public void playingGame(){
        while (!gameOver){
        }
    }


    public Iterable<Person> getPlayers() {
        return null;

    }

    public void gamePlay(){
        String choice = "";
        //Get Players
        ArrayList<BlackJackPlayer> players = new ArrayList<>();


        //Place bets


        //while statement
        BlackJackGame blkjk = new BlackJackGame();

        //Deal phase. to players and dealer
        blkjk.blackJackDeal(players);


        //Natural Phase
            //Show Player Hands
        naturalCheck(players);                          //Show Player Hands

        blkjk.dealer.dealerNaturalPhase();              //Show Dealer Hands


        for (BlackJackPlayer player : players) {        //Player Play Phase
            while (player.playStatusCheck()) {
                player.playerPhase();
                System.out.println("Hit or Statnd?");
                choice = in.nextLine();
                blkjk.playerPhase(player,blkjk.blackJackDeck,choice);

            }
        }

            //Dealer Phase
        blkjk.dealer.dealerHit(blkjk.blackJackDeck);

        //Check Phase

    }

    public void naturalCheck (ArrayList<BlackJackPlayer> bPlayers){
        for (int i = 0; i< bPlayers.size(); i++){
            System.out.println("\nPlayer " + (i+1) + " Hand");
            bPlayers.get(i).playerPhase();
        }
    }

    public void playerPlay(ArrayList<BlackJackPlayer> bPlayers){
        for (int i = 0; i<bPlayers.size(); i++){
        }
    }
}
