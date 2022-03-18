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
    public Boolean win = false;
    public Boolean bust = false;
    public Boolean blackJ = false;
    public Boolean stand = false;

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

    public int blackJhandValue() {  //Check for ACE later
        int value = 0;
        Boolean AceExists = false;
        int aceCount = 0;
        for (int i = 0; i < getHand().size(); i++) {
//            if(getCard(i).getCardRank() == CardValue.ACE){
//                AceExists = true;
//                aceCount++
//            }
            if(getHand().getCard(i).getCardRank().getCardValue() > 10){
                value+= 10;
            } else {
                value += getHand().getCard(i).getCardRank().getCardValue();
            }
        }
        //Need to work on ACE scenario
//        for (int i = 0; i < size(); i++){
//            if(getCard(i).getCardRank() == CardValue.ACE && value <11){
//                value
//            }
//        } //ACE scenario
        //System.out.println(AceExists);
        return value;
    }



    public void hitMe(DeckOfCards deck){
        deck.deal(hand,1);
    }

    public void dealerHit(DeckOfCards deck){        //Passed. Stops at 17 or above
        while(blackJhandValue() < 17){
            hitMe(deck);
        }
    }

    public void bustCheck(){
        if (blackJhandValue() > 21){
            bust = true;
        }
    }

    public void blackJackCheck(){
        if(blackJhandValue() == 21){
            blackJ = true;
        }
    }

    public void setStand(){
        stand = true;
    }

    public void playerStatusCheck(){
        bustCheck();
        blackJackCheck();
    }

    public boolean playStatusCheck(){
        bustCheck();
        blackJackCheck();
        return !bust && !blackJ && !stand;
    }

    public void reset(){
        stand = false;
        bust = false;
        win = false;
    }


}
