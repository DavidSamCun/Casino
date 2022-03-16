package com.github.zipcodewilmington.casino.items.Cards;

import java.util.ArrayList;
import java.util.Iterator;


public class CardCollections {

    private String label;
    public ArrayList<Card> cards;

    public CardCollections(String label){
        this.label = label;
        this.cards = new ArrayList<Card>();
    }

    public String getLabel(){
        return this.label;
    }

    public int size(){
        return cards.size();
    }

    public void addCard(Card card){
        cards.add(card);
    }

    public Card popCard(int i){
        return cards.remove(i);
    }

    public Card popCard(){          //Removes last card on deckStack
        int i = size() -1;
        return popCard(i);
    }

    public Boolean empty(){
        return cards.size()==0;
    }

    public void deal(CardCollections to, int amnt){
        for (int i = 0; i < amnt; i++){
            Card card = popCard();
            to.addCard(card);
        }
    }

    public Card getCard(int i) {
        return cards.get(i);
    }

    public Card last(){
        int i = size()-1;
        return cards.get(i);
    }

    public void clear(){
        cards.clear();
    }

    public void listCard(){

        Iterator cardIterator = cards.iterator();
        while(cardIterator.hasNext()) {
            Card aCard = (Card) cardIterator.next();   //            Card aCard = cardIterator.next();
            System.out.println(aCard.getCardRank() + " of " + aCard.getSuit());
        }

    }

}
