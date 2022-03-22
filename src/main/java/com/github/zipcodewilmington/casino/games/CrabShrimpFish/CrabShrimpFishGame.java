package com.github.zipcodewilmington.casino.games.CrabShrimpFish;

import com.github.zipcodewilmington.casino.GamblingInterface;
import com.github.zipcodewilmington.casino.Game;
import com.github.zipcodewilmington.casino.items.Cards.DeckOfCards;
import com.github.zipcodewilmington.casino.items.Cards.Dice;
import com.github.zipcodewilmington.casino.items.Cards.DiceBin;
import com.github.zipcodewilmington.casino.items.Cards.DiceSimulation;

public class CrabShrimpFishGame extends Game implements GamblingInterface {

    private Dice dice;
    private DiceBin bins;
    private DiceSimulation roll;
    private CrapShrimpFishPlayer crabbieDealer;
    //private Integer[] rolls;

    public CrabShrimpFishGame(){
        this.dice = new Dice();
        this.bins = new DiceBin();
        this.roll = new DiceSimulation(1,3);
        this.crabbieDealer = new CrapShrimpFishPlayer("dealer");
        //rolls = new Integer[3];
    }

    public void rollDice(){
      roll.runSimulation();
      roll.result();
    }

    public int checkRoll(int playerchoice){
        return bins.getRollAmount(playerchoice);
    }



}
