package com.github.zipcodewilmington.casino.games.slots;

import com.github.zipcodewilmington.casino.GamblingInterface;
import com.github.zipcodewilmington.casino.Game;
import com.github.zipcodewilmington.casino.Person;

import java.util.Random;
import java.util.Scanner;

import static com.github.zipcodewilmington.casino.games.slots.SlotReel.BOWSER;

/**
 * Created by leon on 7/21/2020.
 */
public class SlotsGame extends Game implements GamblingInterface{
    private SlotReel[] reel = SlotReel.values();
    public Random rand = new Random();
    SlotReel[] characters = new SlotReel[3];

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
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == BOWSER) {
                if (characters[0] == characters[1] && characters[1] == characters[2]) {
                    return true;
                }
            }
        }
        return false;
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

    public Integer takeBet(Integer input, String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        boolean bet = ((input == 5) || ((input == 10) || (input == 20) || (input == 50) || (input == 100)));
        while (bet == false) {
            System.out.println("\"" + scanner.next() + "\" isn't a bet you can place!");
            scanner.nextInt();
        }
        return input;
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
