package com.github.zipcodewilmington.casino.games.slots;

import com.github.zipcodewilmington.casino.CasinoAccount;
import com.github.zipcodewilmington.casino.Person;
import com.github.zipcodewilmington.casino.PlayerInterface;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by leon on 7/21/2020.
 */
public class SlotsPlayer {
        public Person player;
        Scanner userString = new Scanner(System.in);
        Scanner userInt = new Scanner(System.in);

        public SlotsPlayer(Person player){
                this.player = player;
        }

        public int placeBet(String message) {
                Scanner scanner = new Scanner(System.in);
                while (true) {
                        System.out.println(message);
                        try {
                                return scanner.nextInt();
                        } catch (InputMismatchException e) {
                                System.out.println("\"" + scanner.next() + "\" isn't a number!");
                        }
                }
        }

        public String userString() {
                return userString.next();
        }

        public Integer userInt() {
                return userInt.nextInt();
        }

//        public int getNumber(String message) {
//
//        }

//        public String playChoice() {
//                Scanner scanner1 = new Scanner(System.in);
//                return scanner1.next();
//        }

//        public CasinoAccount getCasinoAccount() {
//                return this.casinoAccount;
//        }

}