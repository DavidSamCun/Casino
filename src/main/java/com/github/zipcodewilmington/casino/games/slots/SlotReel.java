package com.github.zipcodewilmington.casino.games.slots;

public enum SlotReel {
    MARIO(0),
    YOSHI(400),
    LUIGI(100),
    PEACH(300),
    BOWSER(500);

    private int value;

    private SlotReel(int value){
        this.value = value;
    }

    public int getSlotReel(){
        return value;
    }
}