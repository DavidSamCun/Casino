package com.github.zipcodewilmington.casino.games.slots;

import com.github.zipcodewilmington.casino.GamblingInterface;
import com.github.zipcodewilmington.casino.Game;

import java.util.Random;

/**
 * Created by leon on 7/21/2020.
 */
public class SlotsGame extends Game implements GamblingInterface {

    private SlotReel[] reel = SlotReel.values();
    public Random rand = new Random();

    public SlotReel[] spin() {
        SlotReel[] characters = new SlotReel[3];
        for (int i = 0; i < characters.length; i++) {
            characters[i] = reel[rand.nextInt(5)];
        }
        return characters;
    }

    public boolean isWinner(SlotReel[] result) {
        return result[0] == result[1] && result[1] == result[2];
    }

    public String getSlotReel(SlotReel[] result) {
        String[] printSlotReel = new String[3];
        for (int i = 0; i < printSlotReel.length; i++) {
            printSlotReel[i] = result[i].toString();
        }
        String stringSlotReel = printSlotReel[0] + "\n" + printSlotReel[1] + "\n" + printSlotReel[2] + "\n";
        System.out.println(stringSlotReel);
        return stringSlotReel;
    }}
