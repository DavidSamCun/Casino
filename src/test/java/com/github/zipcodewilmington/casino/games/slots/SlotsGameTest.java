package com.github.zipcodewilmington.casino.games.slots;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SlotsGameTest {
    SlotsGame slotsGame = new SlotsGame();

    @Test
    void slotsTest() {
        SlotReel[] characters = slotsGame.spin();
        slotsGame.getSlotReel(characters);
        slotsGame.results(slotsGame.isWinner());
    }

    @Test
    void turn() {
    }
}