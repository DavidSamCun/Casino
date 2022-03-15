package com.github.zipcodewilmington.casino.items;

public enum cards2 {

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

    private cards2(int value){
        this.value = value;
    }

    public int getCardValue(){
        return value;
    }

}

