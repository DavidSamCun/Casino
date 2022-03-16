package com.github.zipcodewilmington.casino.items.Cards;

public class Card {

    private Suit suit;              //Private makes int inaccessable to other classes
    private CardValue cardvalue;    //Should I add final?

    public Card (CardValue cardValue, Suit suit){
        this.cardvalue = cardValue;
        this.suit = suit;
    }

    public Suit getSuit() {         //Only way to get the suit
        return suit;
    }
                                    //Remove setters to make immutable
/*    public void setSuit(Suit suit){
        this.suit = suit;
    }*/

    public CardValue getCardvalue(){
        return cardvalue;
    }

    /*public void setCardvalue(CardValue cardValue){
        this.cardvalue = cardValue;
    }*/
}
