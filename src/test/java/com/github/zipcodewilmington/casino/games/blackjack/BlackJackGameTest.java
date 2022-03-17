package com.github.zipcodewilmington.casino.games.blackjack;

import org.junit.Test;

import java.util.ArrayList;

class BlackJackGameTest {

    ArrayList<BlackJackPlayer> players;

    BlackJackPlayer player1 = new BlackJackPlayer();
    BlackJackPlayer player2 = new BlackJackPlayer();

    @Test
    public void dealTest(){

        BlackJackGame testGame = new BlackJackGame();

        players.add(player1);
        players.add(player2);

        testGame.blackJackDeal(players);

        players.get(0).getHand().listCard();
        players.get(1).getHand().listCard();
    }



}