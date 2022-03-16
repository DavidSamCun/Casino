package com.github.zipcodewilmington.casino.games.tictactoe;

import com.github.zipcodewilmington.casino.Game;
import com.github.zipcodewilmington.casino.GameEngine;
import com.github.zipcodewilmington.casino.Person;
import com.github.zipcodewilmington.casino.PlayerInterface;

import java.util.ArrayList;
import java.util.List;

public class TicTacToeEngine extends GameEngine {

    public TicTacToeEngine(TicTacToeGame game, ArrayList<TicTacToePlayer> players) {
        super(game, players);
    }


    public void start() {
       TicTacToeGame tTT = new TicTacToeGame();
       while(!tTT.isWinner()){
           tTT.turn();
       }
       //ask if you want to exit


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
