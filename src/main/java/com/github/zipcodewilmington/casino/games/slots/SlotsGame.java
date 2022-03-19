package com.github.zipcodewilmington.casino.games.slots;

import com.github.zipcodewilmington.casino.GamblingInterface;
import com.github.zipcodewilmington.casino.Game;

import java.util.Random;

/**
 * Created by leon on 7/21/2020.
 */
public class SlotsGame extends Game {
    private SlotReel[] reel = SlotReel.values();
    public Random rand = new Random();
    SlotReel[] characters = new SlotReel[3];
    SlotsPlayer slotsPlayer = new SlotsPlayer();

//    public String checkPlayerFunds() {
//       int funds = slotsPlayer.getFunds();
//            if(funds >= 5) {
//                spin();
//            }
//            return "Goodbye.";
//    }


    public SlotReel[] spin() {
        for (int i = 0; i < characters.length; i++) {
            characters[i] = reel[rand.nextInt(5)];
        }
        return characters;
    }

    @Override
    public boolean isWinner() {
        return characters[0] == characters[1] && characters[1] == characters[2];
    }

    public String getSlotReel(SlotReel[] result) {
        String[] printSlotReel = new String[3];
        for (int i = 0; i < printSlotReel.length; i++) {
            printSlotReel[i] = result[i].toString();
        }
        String stringSlotReel = printSlotReel[0] + "\n" + printSlotReel[1] + "\n" + printSlotReel[2] + "\n";
        System.out.println(stringSlotReel);
        return stringSlotReel;
    }

    public void results(boolean winner) {
        if (winner) {
            System.out.println("Congratulations, you won!");
        }
        System.out.println("You lose.");
    }

    @Override
    public String turn(Object move, Object marker) {
        return null;
    }
}
