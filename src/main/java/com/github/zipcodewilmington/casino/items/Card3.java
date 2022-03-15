package com.github.zipcodewilmington.casino.items;

public class Card3 {

    private int suit;
    private int value;

    public final static int spades = 0;
    public final static int hearts = 1;
    public final static int diamonds = 2;
    public final static int clubs = 3;

    public final static int ace = 1;
    public final static int jack = 11;
    public final static int queen = 12;
    public final static int king = 13;

    public Card3(int value, int suit){
        if ( suit <= -1 || suit >= 4){
            throw new IllegalArgumentException("Not a suit! Spades is 0, Hearts is 1, Diamonds is 2, and Clubs is 3");
        }
        if (value <= 0 || value >= 14){
            throw new IllegalArgumentException("Not a card value! Ace is 1 and King is 13!");
        }
    }

    public int getSuit(){
        return this.suit;
    }



}
