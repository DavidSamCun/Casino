package com.github.zipcodewilmington.casino.items.Cards;

import java.util.Random;

public class Dice {

    private static Random rand = new Random();
    private static int dice;


    public Dice(){
        dice = 1;
    }

    public Dice(int amnt){
        if(amnt<0){
            System.out.println("Need an amount greater than 0");
        } else {
            dice = amnt;
        }
    }

    public void removeDie(){//Setter
        if (dice > 0) {
            dice--;
        } else {
            System.out.println("Amount can't be less than 1");
        }
    }

    public void addDice(){               //Setter
        dice++;
    }

    public int getAmntDice(){            //Getter
        return dice;
    }

    public int tossAndSum(){

        int output = 0;
        for ( int i = 1; i <= getAmntDice(); i++){
            output += rand.nextInt(1, 7);
        }
        return output;
    }


}

