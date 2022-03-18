package com.github.zipcodewilmington.casino.games.blackjack;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class BlackJackGameTest2 {


    ArrayList<BlackJackPlayer> players = new ArrayList<>();

    BlackJackPlayer player1 = new BlackJackPlayer();
    BlackJackPlayer player2 = new BlackJackPlayer();


    @Test
    void blackJackGame() {

        BlackJackGame testGame = new BlackJackGame();

        testGame.blackJackDeck.listCard();
    }

    @Test
    void blackJackDeal() {          //Dealing to players and

        BlackJackGame testGame = new BlackJackGame();

        players.add(player1);
        players.add(player2);

        testGame.blackJackDeal(players);

        players.get(0).getHand().listCard();
        players.get(1).getHand().listCard();
        testGame.dealer.getHand().listCard();

        System.out.println("Remaining Cards");
        testGame.blackJackDeck.listCard();

    }

    @Test
    void newDecktest() {          //Dealing to players and

        BlackJackGame testGame = new BlackJackGame();

        players.add(player1);
        players.add(player2);

        testGame.blackJackDeal(players);

        players.get(0).getHand().listCard();
        players.get(1).getHand().listCard();
        testGame.dealer.getHand().listCard();

        System.out.println("Old Deck " + testGame.blackJackDeck.size());
        testGame.newDeck();
        System.out.println("New Deck " + testGame.blackJackDeck.size() );
    }

    @Test
    void dealAndValue() {          //Dealing to players WIthout ACE SCENARIO

        BlackJackGame testGame = new BlackJackGame();

        players.add(player1);

        testGame.blackJackDeal(players);
        System.out.println("Player 1");
        players.get(0).getHand().listCard();
        players.get(0).getHand().BlackJhandValue();
        System.out.println(players.get(0).getHand().BlackJhandValue());

        System.out.println("Dealer");
        testGame.dealer.getHand().listCard();
        testGame.dealer.getHand().BlackJhandValue();
        System.out.println(testGame.dealer.getHand().BlackJhandValue());

    }

    @Test
    void hitAndValue() {          //Dealing to players WIthout ACE SCENARIO

        BlackJackGame testGame = new BlackJackGame();

        players.add(player1);

        testGame.blackJackDeal(players);
        System.out.println("Player 1");
        players.get(0).hitMe(testGame.blackJackDeck);
        players.get(0).getHand().listCard();
        players.get(0).getHand().BlackJhandValue();
        System.out.println(players.get(0).getHand().BlackJhandValue());

        System.out.println("Dealer");
        testGame.dealer.hitMe(testGame.blackJackDeck);
        testGame.dealer.getHand().listCard();
        testGame.dealer.getHand().BlackJhandValue();
        System.out.println(testGame.dealer.getHand().BlackJhandValue());


        System.out.println("Remaining Cards " + testGame.blackJackDeck.size());

    }


}