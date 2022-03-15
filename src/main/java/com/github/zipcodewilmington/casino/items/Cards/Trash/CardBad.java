package com.github.zipcodewilmington.casino.items.Cards;

public class CardBad {

    public enum Suit {
        Hearts, Spades, Diamonds, Clubs
    }

    enum cardValue
    {
        ACE(1),
        TWO(2),
        THREE(3),
        FOUR(4),
        FIVE(5),
        SIX(6),
        SEVEN(7),
        EIGHT(8),
        NINE(9),
        TEN(10),
        JACKS(11),
        QUEEN(12),
        KING(13);
        private int value;
        cardValue(int value){
            this.value = value;
        }
    }

    private Suit suit;
    private cardValue cardVal;

    public CardBad(cardValue value, Suit suit){
        this.cardVal = value;
        this.suit = suit;
    }

    public Suit getSuit(){
        return suit;
    }

    public void setSuit(Suit suit){
        this.suit = suit;
    }

    public cardValue getCardValue(){
        return cardVal;
    }

    public void setCardValue(cardValue value){
        this.cardVal = value;
    }

}

