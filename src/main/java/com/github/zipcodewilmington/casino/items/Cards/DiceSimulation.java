package com.github.zipcodewilmington.casino.items.Cards;

public class DiceSimulation {

    private Dice dice;
    private DiceBin bin;
    private int tries;


    public DiceSimulation(){
        this.dice = new Dice(1);
        this.bin = new DiceBin(1, 6);
    }

    public DiceSimulation(int dice, int amountOfTries){
        this.dice = new Dice(dice);
        this.bin = new DiceBin (1*dice, 6*dice);
        this.tries = amountOfTries;
    }

    public void runSimulation(){
        for(int i = 0; i<tries; i++){
            this.bin.incremintBin(dice.tossAndSum());
        }
    }

/*    public void result2(){
        int min = 1*this.dice.getAmntDice();
        int max = 6*this.dice.getAmntDice();
        int range = max - min + 1;
        float percent = 0;
        String rollOutput = "";
        String stars = "";
        String rollResult = "*** \n" +
                "Simulation of " + this.dice.getAmntDice() +
                " dice tossed for " + this.tries + " times. \n" +
                "***\n\n";
        System.out.println(rollResult);
        for(int i = min; i <=max; i++){
            percent = (float) bin.getRollAmount(i)/tries;
            rollOutput += String.format("%-2d :  %6d : %.2f  \n", i, bin.getRollAmount(i), percent);
        }
    }*/

    public void result(){

        int min = 1*this.dice.getAmntDice();
        int max = 6*this.dice.getAmntDice();
        int range = max - min + 1;
        int starsAmnt = 0;
        float percent = 0;
        String rollOutput = "";
        String stars = "";
        String rollResult = "*** \n" +
                "Simulation of " + this.dice.getAmntDice() +
                " dice tossed for " + this.tries + " times. \n" +
                "***\n";
        System.out.println(rollResult);
        for(int i = min; i <=max; i++){
            percent = (float) bin.getRollAmount(i)/tries;
            starsAmnt = Math.round(percent*100);
            for(int j = 0; j < starsAmnt; j++){
                stars+= "*";
            }
            rollOutput += String.format("%-2d :  %6d : %.2f %s \n", i, bin.getRollAmount(i), percent, stars);
            stars = "";
        }
        System.out.println(rollOutput);
    }
}