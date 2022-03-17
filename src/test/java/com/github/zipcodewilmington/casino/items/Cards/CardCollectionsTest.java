package com.github.zipcodewilmington.casino.items.Cards;

import com.github.zipcodewilmington.casino.games.blackjack.BlackJackPlayer;
import org.junit.Test;

public class CardCollectionsTest {

    @Test   //Pass
    public void deckOfCardsTest(){
        DeckOfCards deck = new DeckOfCards("BlackJack");
        deck.listCard();
    }

    @Test   //Pass
    public void clearDeck(){
        DeckOfCards deck = new DeckOfCards("dealHandTest");
        deck.listCard();
        deck.clear();
        System.out.println("Break");
        deck.listCard();
    }

    @Test
    public void dealHand(){ //PASS
        DeckOfCards deck = new DeckOfCards("dealHandTest");
        Hand player1 = new Hand("Player1");

        player1.listCard();
        System.out.println("Deal Phase");
        deck.deal(player1, 2);
        player1.listCard();
    }

    @Test
    public void dealHand2(){ //PASS
        DeckOfCards deck = new DeckOfCards("dealHandTest");
        Hand player1 = new Hand("Player1");
        Hand player2 = new Hand("Player2");
        player1.listCard();
        System.out.println("Deal Phase");
        deck.deal(player1, 2);
        player1.listCard();
    }

    @Test
    public void getValue(){    //PASS
        DeckOfCards deck = new DeckOfCards("dealHandTest");
        Hand player1 = new Hand("Player1");

        player1.listCard();
        System.out.println("Deal Phase");
        deck.deal(player1, 2);
        player1.listCard();

        System.out.println(player1.getCard(0).getCardRank());
        System.out.println(player1.getCard(0).getCardRank().getCardValue());

        int cardValue = player1.getCard(0).getCardRank().getCardValue();
        System.out.println(cardValue);
    }

    @Test
    public void dealPlayerHand(){
        DeckOfCards deck = new DeckOfCards("dealHandTest");
        BlackJackPlayer player1 = new BlackJackPlayer();
//        System.out.println(player1.getHand().display());
        player1.getHand().listCard();
        System.out.println("deal");
        deck.deal(player1.getHand(), 2);
        player1.getHand().listCard();
        //Hand show = player1.getHand();
    }



}