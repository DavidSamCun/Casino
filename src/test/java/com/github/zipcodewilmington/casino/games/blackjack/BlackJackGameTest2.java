package com.github.zipcodewilmington.casino.games.blackjack;

import com.github.zipcodewilmington.casino.items.Cards.Card;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static com.github.zipcodewilmington.casino.items.Cards.CardValue.ACE;
import static com.github.zipcodewilmington.casino.items.Cards.Suit.HEARTS;
import static org.junit.jupiter.api.Assertions.*;

class BlackJackGameTest2 {


    ArrayList<BlackJackPlayer> players = new ArrayList<>();

    BlackJackPlayer player1 = new BlackJackPlayer();
    BlackJackPlayer player2 = new BlackJackPlayer();


    @Test
    void blackJackGame() {

        BlackJackGame testGame = new BlackJackGame();

        testGame.blackJackDeck.listCard();
    }

    @Test
    void blackJackDeal() {          //Dealing to players and

        BlackJackGame testGame = new BlackJackGame();

        players.add(player1);
        players.add(player2);
        testGame.blackJackDeck.listCard();
        testGame.blackJackDeal(players);

        System.out.println("\nDealt Cards\n");

        players.get(0).getHand().listCard();
        players.get(1).getHand().listCard();
        testGame.dealer.getHand().listCard();

        System.out.println("\nRemaining Cards\n");
        testGame.blackJackDeck.listCard();

    }

    @Test
    void newDecktest() {          //Dealing to players and

        BlackJackGame testGame = new BlackJackGame();

        players.add(player1);
        players.add(player2);

        testGame.blackJackDeal(players);

        players.get(0).getHand().listCard();
        players.get(1).getHand().listCard();
        testGame.dealer.getHand().listCard();

        System.out.println("Old Deck " + testGame.blackJackDeck.size());
        testGame.newDeck();
        System.out.println("New Deck " + testGame.blackJackDeck.size() );
    }

    @Test
    void valueTest() {          //Dealing to players and

        //Given
        BlackJackGame testGame = new BlackJackGame();
        players.add(player1);
        //players.add(player2);

        //When
        testGame.blackJackDeal(players);

            //Player1 Hand
        System.out.println("Player 1");
        players.get(0).getHand().listCard();
        System.out.println(players.get(0).blackJhandValue());
        //players.get(1).getHand().listCard();

        System.out.println("\nDealer\n");
        testGame.dealer.getHand().listCard();
        System.out.println(testGame.dealer.blackJhandValue());

    }

    @Test
    void playHitTest() {          //Dealing to players and

        //Given
        BlackJackGame testGame = new BlackJackGame();
        players.add(player1);
        String choice = "hit";

        //When
        testGame.blackJackDeal(players);

        //Player1 Hand
        System.out.println("Player 1");
        players.get(0).getHand().listCard();
        System.out.println(players.get(0).blackJhandValue());

        testGame.playerPhase(players.get(0), testGame.blackJackDeck, choice);
        players.get(0).getHand().listCard();
        System.out.println(players.get(0).blackJhandValue());
        //players.get(1).getHand().listCard();

    }

    @Test
    void standStatusCheck() {          //Dealing to players and

        //Given
        BlackJackGame testGame = new BlackJackGame();
        players.add(player1);
        String choice = "stand";

        //When
        testGame.blackJackDeal(players);

        //Player1 Hand
        System.out.println("Player 1");

        testGame.playerPhase(players.get(0), testGame.blackJackDeck, choice);
        players.get(0).getHand().listCard();
        System.out.println(players.get(0).blackJhandValue());
        System.out.println(players.get(0).stand);
        System.out.println(players.get(0).playStatusCheck());

    }

    @Test
    void playStatusCheck() {          //Dealing to players and

        //Given
        BlackJackGame testGame = new BlackJackGame();
        players.add(player1);
        String choice = "hit";

        //When
        testGame.blackJackDeal(players);

        //Player1 Hand
        System.out.println("Player 1");

        testGame.playerPhase(players.get(0), testGame.blackJackDeck, choice);
        players.get(0).getHand().listCard();
        System.out.println(players.get(0).blackJhandValue());
        System.out.println(players.get(0).playStatusCheck());

    }

    @Test
    void dealHitTest() {          //Dealing to players and

        //Given
        BlackJackGame testGame = new BlackJackGame();

        //When
        testGame.blackJackDeal(players);
        System.out.println("\nDealer\n");
        testGame.dealer.getHand().listCard();
        System.out.println(testGame.dealer.blackJhandValue());

        System.out.println("\nHit\n");

        testGame.dealer.dealerHit(testGame.blackJackDeck);
        testGame.dealer.getHand().listCard();
        System.out.println(testGame.dealer.blackJhandValue());

    }

    @Test
    void dealStatusTest() {          //Dealing to players and

        //Given
        BlackJackGame testGame = new BlackJackGame();

        //When
        testGame.blackJackDeal(players);
        System.out.println("\nDealer\n");
        testGame.dealer.getHand().listCard();
        System.out.println(testGame.dealer.blackJhandValue());

        System.out.println("\nHit\n");

        testGame.dealer.dealerHit(testGame.blackJackDeck);
        testGame.dealer.getHand().listCard();
        System.out.println(testGame.dealer.blackJhandValue());
        System.out.println(testGame.dealer.playStatusCheck());
        System.out.println(testGame.dealer.blackJ);


    }

    @Test
    void setStandTest(){
        //Given
        BlackJackGame testGame = new BlackJackGame();
        players.add(player1);
        boolean expected = true;

        //When
        testGame.blackJackDeal(players);
        players.get(0).setStand();
        boolean actual = players.get(0).stand;
                //Then
        assertEquals(expected, actual);
    }

    @Test
    void resetTest(){
        //Given
        BlackJackGame testGame = new BlackJackGame();
        players.add(player1);
        boolean expected = false;

        //When
        testGame.blackJackDeal(players);
        players.get(0).setStand();
        players.get(0).reset();
        boolean actual = players.get(0).stand;
        //Then
        assertEquals(expected, actual);
    }

    @Test
    void aceDealerTest(){

        //Given
        BlackJackGame testGame = new BlackJackGame();

        //When
        testGame.blackJackDeal(players);
        System.out.println("\nDealer\n");
        testGame.dealer.getHand().listCard();
        System.out.println(testGame.dealer.blackJhandValue());

        System.out.println("\nHit\n");

        testGame.dealer.dealerHit(testGame.blackJackDeck);
        testGame.dealer.getHand().listCard();
        System.out.println(testGame.dealer.blackJhandValue());
        System.out.println(testGame.dealer.playStatusCheck());
        System.out.println(testGame.dealer.blackJ);

    }

    @Test
    void playAceTest() {          //Test Ace Condition

        //Given
        BlackJackGame testGame = new BlackJackGame();
        players.add(player1);
        String choice = "hit";

        //When
        testGame.blackJackDeal(players);
        players.get(0).getHand().addCard(new Card(ACE, HEARTS));

        //Player1 Hand
        System.out.println("Player 1");
        players.get(0).getHand().listCard();
        System.out.println(players.get(0).blackJhandValue());

        players.get(0).getHand().addCard(new Card(ACE, HEARTS));
        players.get(0).getHand().addCard(new Card(ACE, HEARTS));
        players.get(0).getHand().listCard();
        System.out.println(players.get(0).blackJhandValue());
        //players.get(1).getHand().listCard();

    }

    @Test
    void dealerNaturalPhaseTest(){

        BlackJackGame testGame = new BlackJackGame();

        players.add(player1);
        players.add(player2);
        testGame.blackJackDeal(players);

        System.out.println("\nDealt Cards\n");

//        players.get(0).getHand().listCard();
//        players.get(1).getHand().listCard();
        testGame.dealer.dealerNaturalPhase();

    }

    @Test
    void winStatusTest (){

        BlackJackGame testGame = new BlackJackGame();
        String choice = "hit";

        players.add(player1);
        players.add(player2);
        testGame.blackJackDeal(players);                //Deal Phase

        for (int i = 0; i< players.size(); i++){                //Natural Phase players
            System.out.println("\nPlayer " + (i+1) + " Hand");
            players.get(i).playerHand();
        }

        System.out.println("\nPlayer 1");
        testGame.playerPhase(players.get(0), testGame.blackJackDeck, choice);

        System.out.println("\nPlayer 2");
        testGame.playerPhase(players.get(1), testGame.blackJackDeck, choice);

        System.out.println("\nDealer");
        testGame.dealer.dealerNaturalPhase();
        testGame.dealer.dealerHit(testGame.blackJackDeck);
        System.out.println("\nDealer after Deal");
        testGame.dealer.playerHand();


        System.out.println("\nChecking Winners\n");
        for (BlackJackPlayer player: players) {
            testGame.getWinner(player);
        }

        int playVal = 1;
        for (BlackJackPlayer player: players) {
            System.out.println("Player " + playVal + " " + player.win);
            playVal++;
        }
    }

}