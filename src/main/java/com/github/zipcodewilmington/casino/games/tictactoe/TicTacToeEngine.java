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
        String result = "";
        int[] move = new int[]{,};
        TicTacToeGame tTT = new TicTacToeGame();
        for(int x=0;x< players.size();x++) {

            while (!tTT.isWinner()) {
                TicTacToePlayer player = players.get(x);
                move = player.getMove();
                result = tTT.turn(move);
                if (result.equals("Not a valid move")) {
                    player.getMove();
                } else if (result.equals("Board Full")) {
                    System.out.println("It is a tie");
                    return;
                }
            }
            //ask if you want to exit

        }
    }


    public Game getGame() {
        return null;
    }

    public void exitGame() {

    }

    public void replay() {

    }

    public Iterable<Person> getPlayers() {
        return null;
    }
}
