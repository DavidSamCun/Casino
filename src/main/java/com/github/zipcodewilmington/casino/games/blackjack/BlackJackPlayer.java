package com.github.zipcodewilmington.casino.games.blackjack;

import com.github.zipcodewilmington.casino.CasinoAccount;
import com.github.zipcodewilmington.casino.Person;
import com.github.zipcodewilmington.casino.PlayerInterface;
import com.github.zipcodewilmington.casino.items.Cards.CardValue;
import com.github.zipcodewilmington.casino.items.Cards.DeckOfCards;
import com.github.zipcodewilmington.casino.items.Cards.Hand;


public class BlackJackPlayer implements PlayerInterface {

    public Person player;
    private String name;
    private Hand hand;
    public Boolean win = false;
    public Boolean tie = false;
    public Boolean bust = false;
    public Boolean blackJ = false;
    public Boolean stand = false;

    public BlackJackPlayer(){               //Default for dealer
        this.name = "Player1";
        this.hand = new Hand("hand)");
    }

    public BlackJackPlayer(Person player){  //For the guests
        player.getName();
        this.hand = new Hand("Hand");
    }

    public BlackJackPlayer(CasinoAccount player){  //For the guests
        this.name = player.getAccountName();
        this.hand = new Hand("Hand");
    }

    public Hand getHand() {
        return hand;
    }

    public int blackJhandValue() {
        int value = 0;
        int aceCount = 0;
        for (int i = 0; i < getHand().size(); i++) {
            if(getHand().getCard(i).getCardRank() == CardValue.ACE){
                value+=11;
                aceCount++;
            } else if (getHand().getCard(i).getCardRank().getCardValue() > 10){
                value+= 10;
            } else {
                value += getHand().getCard(i).getCardRank().getCardValue();
            }
        }
        for (int i = 0; i < aceCount; i++) {
            if (aceCount > 0 && value > 21) {
                value -= 10;
            }
        }
        return value;
    }

    public void hitMe(DeckOfCards deck){
        deck.deal(hand,1);
    }

    public void dealerHit(DeckOfCards deck){        //Passed. Stops at 17 or above
        while(blackJhandValue() < 17){
            hitMe(deck);
        }
        blackOrBust();
    }

    public void bustCheck(){
        if (blackJhandValue() > 21){
            bust = true;
            System.out.println("BUST");
        }
    }

    public void blackJackCheck(){
        if(blackJhandValue() == 21){
            blackJ = true;
            stand = true;
        }
    }

    public void setStand(){
        stand = true;
    }

    public void blackOrBust(){        //Does a quick update
        bustCheck();
        blackJackCheck();
    }

    public boolean playStatusCheck(){       //Allows continuation of HitMe
        bustCheck();
        blackJackCheck();
        return !bust && !stand;
    }

    public void playerHand(){
        getHand().listCard();
        System.out.println("Hand Value is " + blackJhandValue());
        blackOrBust();
    }

    public void dealerNaturalPhase(){
        blackJackCheck();
        System.out.println("\nDealer Hand");
        if(blackJ){
            getHand().listCard();
            System.out.println("Dealer has BlackJack");
        } else if(getHand().getCard(0).getCardRank().getCardValue() > 9 ||
                getHand().getCard(0).getCardRank().getCardValue() ==1){
            getHand().show1Card(0);
            getHand().show1Card(1);
            System.out.println("Hand Value is " + blackJhandValue());
        }
        else{
            getHand().show1Card(0);
        }
    }

    public void reset(){
        stand = false;
        bust = false;
        win = false;
    }

    public <SomeReturnType> SomeReturnType play() {
        return null;
    }

    @Override
    public CasinoAccount getCasinoAccount() {
        return null;
    }
}