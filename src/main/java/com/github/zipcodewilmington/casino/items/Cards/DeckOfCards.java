package com.github.zipcodewilmington.casino.items.Cards;

import java.util.Collections;
import java.util.Iterator;

public class DeckOfCards extends CardCollections {

    //private ArrayList deck;

    public DeckOfCards(String label){
        super(label);
        //this.deck = new ArrayList();

        for (int i=0; i<13; i++){
            CardValue value = CardValue.values()[i];

            for (int j = 0; j<4; j++){
                Card card = new Card(value, Suit.values()[j]);
                cards.add(card);
            }
        }

        Collections.shuffle(cards);

//        Iterator cardIterator = cards.iterator();
//
//        while(cardIterator.hasNext()){
//            Card aCard = (Card) cardIterator.next();   //            Card aCard = cardIterator.next();
//            System.out.println(aCard.getCardvalue() + " of " + aCard.getSuit());
//        }

    }

//    public void listCard(){
//
//        Iterator cardIterator = cards.iterator();
//        while(cardIterator.hasNext()) {
//            Card aCard = (Card) cardIterator.next();   //            Card aCard = cardIterator.next();
//            System.out.println(aCard.getCardvalue() + " of " + aCard.getSuit());
//        }
//
//    }

}

//    public DeckOfCards(){
//
//        this.deck = new ArrayList();
////        for (int i = 0; i<4; i++){
////
////            Card value = Card.cardValue()[i];
////
////            for(int j = 0; j < 13; j++){
////                Card card = new Card()
////            }
////        }
//
//        for (int i = 0; i < 13; i++){
//            Card value = new Card.cardValue(i);
//
//            for (int j = 0; j < 4; j++){
//                Card card = new Card(value, Card.Suit.values()[j]);
//            }
//
//        }
//
//    }