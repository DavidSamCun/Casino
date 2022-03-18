package com.github.zipcodewilmington.casino.games.blackjack;

import com.github.zipcodewilmington.casino.GamblingInterface;
import com.github.zipcodewilmington.casino.Game;
import com.github.zipcodewilmington.casino.items.Cards.CardCollections;
import com.github.zipcodewilmington.casino.items.Cards.DeckOfCards;
import com.github.zipcodewilmington.casino.items.Cards.Hand;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class BlackJackGame extends Game implements GamblingInterface {

//        public DeckOfCards blackJackDeck;
//        public Hand dealer;

        public DeckOfCards blackJackDeck;
        public BlackJackPlayer dealer;
        Scanner in = new Scanner(System.in);
        //public Hand dealer = new Hand("Dealer");

        public BlackJackGame(){
                this.blackJackDeck = new DeckOfCards("BlackJack");
                this.dealer = new BlackJackPlayer();
        }

        public void newDeck(){
                this.blackJackDeck= new DeckOfCards("BlackJack");
        }

        public void blackJackDeal(ArrayList<BlackJackPlayer> players){                     //Deals to players
                for( int i = 0; i<2; i++){
                        for(int j = 0; j < players.size(); j++){
                                blackJackDeck.deal(players.get(j).getHand(), 1);
                        }
                        blackJackDeck.deal(dealer.getHand(), 1);
                }
        }


//        public void playerPlay(ArrayList<BlackJackPlayer> players, DeckOfCards deck){
//                boolean stand = false;
//                int choice = 0;
//                for (int i = 0; i < players.size(); i++){
//                        System.out.println("Player " + (i + 1));
//                        while(!players.get(i).bust && players.get(i).getHand().BlackJhandValue() < 21 && !stand){
//                                //System.out.println("Hit or Stand?");
//                                choice = in.nextInt();
//                                switch (choice){
//                                        case 1:
//                                                players.get(i).hitMe(deck);
//                                                break;
//                                        case 2:
//                                                stand = true;
//                                }
//                                System.out.println(players.get(i).getHand().BlackJhandValue());
//                                if(players.get(i).getHand().BlackJhandValue()>21){
//                                        players.get(i).bust = true;
//                                }
//
//                        }
//
//                }
//        }

        public void hitMe(BlackJackPlayer bPlayer, DeckOfCards bDeck, String choice) {
                switch (choice.toLowerCase(Locale.ROOT)) {
                        case "hit":
                                bPlayer.hitMe(bDeck);
                                break;
                        case "stand":
                                bPlayer.stand = true;
                                break;
                }
        }

        public boolean playStatus(BlackJackPlayer bPlayer){
                return bPlayer.playStatusCheck();
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