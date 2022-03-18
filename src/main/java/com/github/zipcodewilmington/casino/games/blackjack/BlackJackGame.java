package com.github.zipcodewilmington.casino.games.blackjack;

import com.github.zipcodewilmington.casino.GamblingInterface;
import com.github.zipcodewilmington.casino.Game;
import com.github.zipcodewilmington.casino.items.Cards.DeckOfCards;

import java.util.ArrayList;
import java.util.Locale;

public class BlackJackGame extends Game implements GamblingInterface {

        public DeckOfCards blackJackDeck;
        public BlackJackPlayer dealer;

        public BlackJackGame() {
                this.blackJackDeck = new DeckOfCards("BlackJack");
                this.dealer = new BlackJackPlayer();
        }

        public void newDeck() {
                this.blackJackDeck = new DeckOfCards("BlackJack");
        }

        public void blackJackDeal(ArrayList<BlackJackPlayer> players) {                     //Deals to players
                for (int i = 0; i < 2; i++) {
                        for (BlackJackPlayer player : players) {
                                blackJackDeck.deal(player.getHand(), 1);
                        }
                        blackJackDeck.deal(dealer.getHand(), 1);
                }
        }

//        public void showPlayerHand(BlackJackPlayer bPlayer){
//                bPlayer.getHand()
//        }

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

        public void playerPhase(BlackJackPlayer bPlayer, DeckOfCards bDeck, String choice) {
                switch (choice.toLowerCase(Locale.ROOT)) {
                        case "hit":
                                bPlayer.hitMe(bDeck);
                                bPlayer.playerHand();
                                break;
                        case "stand":
                                bPlayer.stand = true;
                                break;
                        default:
                                System.out.println("Invalid Entry");
                }
        }

        public void getWinner(BlackJackPlayer bPlayer) {
                if (bPlayer.blackJ && !dealer.blackJ) {
                        bPlayer.win = true;
                } else if (!bPlayer.bust && dealer.bust) {
                        bPlayer.win = true;
                } else if (!bPlayer.bust && !dealer.bust) {
                        if (bPlayer.blackJhandValue() > dealer.blackJhandValue()) {
                                bPlayer.win = true;
                        } else if (bPlayer.blackJhandValue() == dealer.blackJhandValue()) {
                                bPlayer.tie = true;

                        }

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