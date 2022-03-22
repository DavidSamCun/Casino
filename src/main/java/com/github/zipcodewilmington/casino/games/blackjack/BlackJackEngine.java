package com.github.zipcodewilmington.casino.games.blackjack;

import com.github.zipcodewilmington.casino.Game;
import com.github.zipcodewilmington.casino.GameEngine;
import com.github.zipcodewilmington.casino.Person;
import com.github.zipcodewilmington.casino.games.tictactoe.TicTacToeGame;
import com.github.zipcodewilmington.casino.games.tictactoe.TicTacToePlayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class BlackJackEngine extends GameEngine {

    Scanner in = new Scanner(System.in);
    ArrayList<BlackJackPlayer> players;

    public BlackJackEngine(BlackJackGame game, ArrayList<BlackJackPlayer> players) {
        super(game, players);
    }

    String choice = "";
    Boolean confirm = false;
    boolean gameOver = false;
    //Game blackJack = getGame();
    BlackJackGame blackJack = new BlackJackGame();

    @Override
    public void start() {
        players = new ArrayList<>();
        addPlayer();

        gameOver = false;
        while(!gameOver){


            //need to add bet


            System.out.println("\nDealing\n");
            blackJack.blackJackDeal(players);                   //Deal phase. to players and dealer
            System.out.println("\nEntering Natural Phase\n");
            //Natural Phase
            naturalCheck(players);                              //Show Player Hands
            System.out.println("\n\n");
            blackJack.dealer.dealerNaturalPhase();              //Show Dealer Hands
            for (BlackJackPlayer player : players) {            //Player Play Phase
                while (player.playStatusCheck()) {
                    player.playerHand();
                    System.out.println("Hit or Stand?");
                    choice = in.nextLine();
                    blackJack.playerPhase(player,blackJack.blackJackDeck,choice);
                    choice = "";
                }
            }
            blackJack.dealer.dealerHit(blackJack.blackJackDeck);    //Dealer Phase


            for (BlackJackPlayer player : players){         //Check Winner Phase
                blackJack.getWinner(player);
            }

            //PayOut

            for(BlackJackPlayer player : players){          //Reset Status
                player.reset();
            }
            blackJack.dealer.reset();



            while(confirm){
                System.out.println("Play again?\n yes or no?");
                choice = in.nextLine();
                if(choice.toLowerCase(Locale.ROOT).equals("yes")){
                    confirm = true;
                } else if (choice.toLowerCase(Locale.ROOT).equals("no")){
                    confirm = true;
                    exitGame();
                } else{
                    System.out.println("invaild choice");
                }

            }

        }



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

   public void addPlayer(){
        System.out.println("Enter Name");
        String name = in.nextLine();
        Person player1 = new Person(name, 1000);
        BlackJackPlayer newPlayer = new BlackJackPlayer(player1);
        players.add(newPlayer);
   }



//    public Iterable<Person> getPlayers() {
//        return null;
//
//    }

/*    public void gamePlay(){
        String choice = "";
        //Get Players
        ArrayList<BlackJackPlayer> players = new ArrayList<>();


        //Place bets

        //While Loop
        BlackJackGame blkjk = new BlackJackGame();

        blkjk.blackJackDeal(players);                   //Deal phase. to players and dealer
                                                        //Natural Phase
        naturalCheck(players);                          //Show Player Hands
        System.out.println("\n\n");
        blkjk.dealer.dealerNaturalPhase();              //Show Dealer Hands
        System.out.println("\n\n");
        for (BlackJackPlayer player : players) {        //Player Play Phase
            while (player.playStatusCheck()) {
                player.playerHand();
                System.out.println("Hit or Stand?");
                choice = in.nextLine();
                blkjk.playerPhase(player,blkjk.blackJackDeck,choice);
            }
        }
        blkjk.dealer.dealerHit(blkjk.blackJackDeck);    //Dealer Phase


        for (BlackJackPlayer player : players){         //Check Winner Phase
            blkjk.getWinner(player);
        }

        //PayOut

        for(BlackJackPlayer player : players){          //Reset Status
            player.reset();
        }
        blkjk.dealer.reset();

    }*/

    public void naturalCheck (ArrayList<BlackJackPlayer> bPlayers){
        for (int i = 0; i< bPlayers.size(); i++){
            System.out.println("\nPlayer " + (i+1) + " Hand");
            bPlayers.get(i).playerHand();

        }
    }

}
