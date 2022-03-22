package com.github.zipcodewilmington.casino.games.CrabShrimpFish;

import com.github.zipcodewilmington.casino.CasinoAccount;
import com.github.zipcodewilmington.casino.Person;
import com.github.zipcodewilmington.casino.PlayerInterface;
import com.github.zipcodewilmington.casino.items.Cards.Hand;

public class CrapShrimpFishPlayer implements PlayerInterface {

    private Person player;
    private String name;
    public Hand hand;

    private int funds;

    private boolean win = false;
    private int tieBet;

    private int dealerBet;
    private int playerBet;

    public CrapShrimpFishPlayer(){
        this.name = "Player1";
        this.hand = new Hand("BlackJack");
    }

    public CrapShrimpFishPlayer(Person player){
        this.name  = player.getName();
        this.hand  = new Hand("Hand");
        this.funds = player.getFunds();
    }

    public CrapShrimpFishPlayer(String name){
        this.name = name;
        this.hand = new Hand("Hand");
        this.funds = 50000;
    }




    @Override
    public CasinoAccount getArcadeAccount() {
        return null;
    }

    @Override
    public <SomeReturnType> SomeReturnType play() {
        return null;
    }
}
