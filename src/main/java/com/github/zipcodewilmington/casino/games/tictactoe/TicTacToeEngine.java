package com.github.zipcodewilmington.casino.games.tictactoe;

import com.github.zipcodewilmington.casino.Game;
import com.github.zipcodewilmington.casino.GameEngine;
import com.github.zipcodewilmington.casino.Person;

import java.util.ArrayList;

public class TicTacToeEngine extends GameEngine {

    public TicTacToeEngine(TicTacToeGame game, ArrayList<TicTacToePlayer> players) {
        super(game, players);
    }


    public void start() {
        String result;
        char markerX = 'X', markerY = 'Y';
        int[] move;
            while (!game.isWinner()) {
                for (int x = 0; x < players.size(); x++) {
                    TicTacToePlayer player = (TicTacToePlayer) players.get(x);
                    do {
                        move = player.getMove();
                        if (x == 0) {
                            result = game.turn(move, markerX);
                        } else result = game.turn(move, markerY);
                        if (result.equals("Board Full")) {
                            System.out.println("It is a tie");
                            return;
                        }
                }while(result.equals("Not a valid move"));
                //ask if you want to exit

            }
        }
    }


    public Game getGame() {
       return this.game;
    }

    public void exitGame() {

    }

    public void replay() {

    }

//    public Iterable<Person> getPlayers() {
//    }
}
