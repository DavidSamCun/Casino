package com.github.zipcodewilmington.casino.games.blackjack;

import com.github.zipcodewilmington.casino.Person;
import com.github.zipcodewilmington.casino.PlayerInterface;
import com.github.zipcodewilmington.casino.items.Cards.Card;
import com.github.zipcodewilmington.casino.items.Cards.DeckOfCards;
import com.github.zipcodewilmington.casino.items.Cards.Hand;

import java.util.Scanner;

public class BlackJackPlayer extends Person implements PlayerInterface {
    Scanner scanner = new Scanner(System.in);

    private String name;
    private Hand hand;
    public Boolean Win = false;
    public Boolean bust = false;

    public BlackJackPlayer(){
        this.name = name;
        this.hand = new Hand("hand)");
    }

    public String makeChoice(){        //
        return scanner.nextLine();
    }

    public Hand getHand() {
        return hand;
    }

//    public int handValue(){
//        int value = 0;
//
//        for (int i = 0; i < hand.size(); i++){
//            value += hand.getCard(i).getCardRank().getCardValue();
//        }
//
//        return value;
//    }

    //    public getHand(){
//        this.han
//    }

    public void hitMe(DeckOfCards deck){
        deck.deal(hand,1);
    }


}
