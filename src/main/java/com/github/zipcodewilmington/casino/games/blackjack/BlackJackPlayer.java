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

    public int BlackJhandValue() {  //Check for ACE later
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

    public boolean playStatusCheck(){
        bustCheck();
        blackJackCheck();
        return !bust && !blackJ && !stand;
    }

    public void hitMe(DeckOfCards deck){
        deck.deal(hand,1);
    }

    public void bustCheck(){
        if (BlackJhandValue() > 21){
            bust = true;
        }
    }

    public void blackJackCheck(){
        if(BlackJhandValue() == 21){
            blackJ = true;
        }
    }

    public void setStand(){
        stand = true;
    }

    public void reset(BlackJackPlayer bPlayer){
        bPlayer.stand = false;
        bPlayer.bust = false;
        bPlayer.win = false;
    }


}
