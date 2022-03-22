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
        System.out.println("\nRolling Dice...........");
        roll.runSimulation();
        roll.result();
        System.out.println("\nEndRoll............");
    }

    public int checkWin(CrapShrimpFishPlayer player){
        int wins = 0;
        int winnings = 0;

        System.out.println("\nChecking winnings............");
        for(int i = 0; i < 6; i++){
            if(player.getPlayerBet2()[i] > 0 && bins.getRollAmount(i+1) > 0){
                System.out.println("Congrats! You bet on " + (i+1) + " and appeared " + bins.getRollAmount(i+1) + " time(s)");
                 winnings = player.getPlayerBet2()[i]*bins.getRollAmount(i+1);
                 wins++;
            }
        }
        if(wins > 0){
            System.out.println("Congrats on being lucky!");
        } else {
            System.out.println("Better luck next time!");
        }
        return winnings;
    }

    public int checkRoll(int playerchoice){
        return bins.getRollAmount(playerchoice);
    }



}
