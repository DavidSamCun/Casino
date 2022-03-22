package com.github.zipcodewilmington.casino.items.Cards;

public class DiceBin {


    private static int min;
    private static int max;
    private static int[] bin;

    public DiceBin(){
        this.min = 1;
        this.max = 6;
        this.bin = new int[max+1];
    }

    public DiceBin(int min, int max){
        this.min = min;
        this.max = max;
        this.bin = new int[max+1];
    }

    public void incremintBin(int roll){
        bin[roll]++;
    }

    public int getRollAmount(int roll){
        return bin[roll];
    }

}