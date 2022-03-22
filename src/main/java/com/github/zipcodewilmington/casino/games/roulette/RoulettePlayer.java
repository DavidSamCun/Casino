package com.github.zipcodewilmington.casino.games.roulette;

import com.github.zipcodewilmington.casino.CasinoAccount;
import com.github.zipcodewilmington.casino.Person;
import com.github.zipcodewilmington.casino.PlayerInterface;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RoulettePlayer implements PlayerInterface{
    public Person player;
    Integer move;
    String betType;

    public RoulettePlayer(Person player){
        this.player = player;
    }



    public Integer makeMove(){
        Scanner scanner = new Scanner(System.in);
        int x =0;
        try{
            System.out.println("Please choose a number: ");
            x = scanner.nextInt();
        }catch (InputMismatchException e){
            System.out.println(" "+scanner.next()+ " isn't a number!");
        }
        //ask for move
        move = x;
        return x;
    }

    public int getFunds() {
       return (player.getFunds());
    }

    public void setFunds(int i) {
        player.setFunds(i);
    }

    @Override
    public CasinoAccount getCasinoAccount() {
        return null;
    }
    //choose number
        //place bet }
}
