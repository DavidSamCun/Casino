package com.github.zipcodewilmington.casino.games.blackjack;

import com.github.zipcodewilmington.casino.GamblingInterface;
import com.github.zipcodewilmington.casino.Game;
import com.github.zipcodewilmington.casino.items.Cards.CardCollections;
import com.github.zipcodewilmington.casino.items.Cards.DeckOfCards;
import com.github.zipcodewilmington.casino.items.Cards.Hand;

import java.util.ArrayList;
import java.util.Collections;

public class BlackJackGame extends Game implements GamblingInterface {

//        public DeckOfCards blackJackDeck;
//        public Hand dealer;

        public DeckOfCards blackJackDeck = new DeckOfCards("BlackJack");
        public Hand dealer = new Hand("Dealer");

        public void BlackJackGame(){
                this.blackJackDeck = new DeckOfCards("BlackJack");
                this.dealer = new Hand("Dealer");
        }

        public void newDeck(){
                this.blackJackDeck= new DeckOfCards("BlackJack");
        }

        public void blackJackDeal(ArrayList<BlackJackPlayer> players){                     //Deals to players
                for( int i = 0; i<2; i++){
                        for(int j = 0; j < players.size(); j++){
                                blackJackDeck.deal(players.get(j).getHand(), 1);
                        }
                        blackJackDeck.deal(dealer, 1);
                }
        }




}


//        public void deal2(ArrayList<BlackJackPlayer> players, CardCollections deck){                     //Deals to players
//                for( int i = 0; i<2; i++){
//                        for(int j = 0; j < players.size(); i++){
//                                deck.deal(players.get(i).getHand(), 1);
//                        }
//                        deck.deal(dealer, 1);
//                }
//        }