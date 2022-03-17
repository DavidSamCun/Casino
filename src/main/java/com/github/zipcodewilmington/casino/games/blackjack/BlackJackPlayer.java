package com.github.zipcodewilmington.casino.games.blackjack;

import com.github.zipcodewilmington.casino.Person;
import com.github.zipcodewilmington.casino.PlayerInterface;
import com.github.zipcodewilmington.casino.items.Cards.Hand;

import java.util.Scanner;

public class BlackJackPlayer extends Person implements PlayerInterface {
    Scanner scanner = new Scanner(System.in);

    private String name;
    private Hand hand;

    public BlackJackPlayer(){
        this.name = name;
        this.hand = new Hand("hand)");
    }

    public String makeChoice(){        //
        return scanner.nextLine();
    }

    public Hand getHand() {
        return hand;
    }

    //    public getHand(){
//        this.han
//    }

}
