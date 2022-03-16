package com.github.zipcodewilmington.casino.games.roulette;

import com.github.zipcodewilmington.casino.Game;
import com.github.zipcodewilmington.casino.GameEngine;
import com.github.zipcodewilmington.casino.Person;
import com.github.zipcodewilmington.casino.games.tictactoe.TicTacToeGame;
import com.github.zipcodewilmington.casino.games.tictactoe.TicTacToePlayer;

import java.util.ArrayList;
import java.util.List;

public class RouletteEngine extends GameEngine {

    public RouletteEngine(RouletteGame game, ArrayList<RoulettePlayer> players) {
        super(game, players);
    }


    @Override
    public void start() {

    }

    @Override
    public Game getGame() {
        return null;
    }

    @Override
    public void exitGame() {

    }

    @Override
    public void replay() {

    }


    public Iterable<Person> getPlayers() {
        return null;
    }
}
