package com.github.zipcodewilmington.casino.items.Cards;

public class Hand extends CardCollections {

    public Hand(String label){
        super(label);
    }

    public void display(){
        System.out.println(getLabel() + ": ");
        for (int i = 0; i < size(); i++){
            System.out.println(getCard(i));
        }

    }

/*    public int BlackJhandValue() {
        int value = 0;
        Boolean AceExists = false;

        for (int i = 0; i < size(); i++) {
//            if(getCard(i).getCardRank() == CardValue.ACE){
//                AceExists = true;
//            }
            if(getCard(i).getCardRank().getCardValue() > 10){
                value+= 10;
            } else {
                value += getCard(i).getCardRank().getCardValue();
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
    }*/

}
