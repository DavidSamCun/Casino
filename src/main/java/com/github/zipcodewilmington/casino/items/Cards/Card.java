package com.github.zipcodewilmington.casino.items.Cards;

public class Card {

    private Suit suit;
    private CardValue cardvalue;

    public Card (CardValue cardValue, Suit suit){
        this.cardvalue = cardValue;
        this.suit = suit;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit){
        this.suit = suit;
    }

    public CardValue getCardRank(){
        return cardvalue;
    }

    public void setCardvalue(CardValue cardValue){
        this.cardvalue = cardValue;
    }
}
