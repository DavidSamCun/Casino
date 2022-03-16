package com.github.zipcodewilmington.casino.games.bingo;

import com.github.zipcodewilmington.casino.Game;
import com.github.zipcodewilmington.casino.GameEngine;
import com.github.zipcodewilmington.casino.Person;

import java.util.List;

public class BingoEngine extends GameEngine {

    public BingoEngine(Game game, List<Person> players) {
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

    @Override
    public Iterable<Person> getPlayers() {
        return null;
    }
}
