package com.github.zipcodewilmington.casino.games.blackjack;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

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
        testGame.dealer.listCard();

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
        testGame.dealer.listCard();

        System.out.println("New Deck");
        testGame.newDeck();
        testGame.blackJackDeck.size();
        System.out.println("New Deck" + testGame.blackJackDeck.size() );

    }
}