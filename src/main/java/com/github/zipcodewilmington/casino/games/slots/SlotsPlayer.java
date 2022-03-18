package com.github.zipcodewilmington.casino.games.slots;

import com.github.zipcodewilmington.casino.Person;
import com.github.zipcodewilmington.casino.PlayerInterface;

import java.util.Scanner;

/**
 * Created by leon on 7/21/2020.
 */
public class SlotsPlayer {
        Scanner scanner = new Scanner(System.in);

        public SlotsPlayer(String firstName, String lastName, int funds) {
//            super(firstName, lastName, funds);
        }

        public boolean fundsCheck(int funds) {
            return funds >= 5;
        }
}