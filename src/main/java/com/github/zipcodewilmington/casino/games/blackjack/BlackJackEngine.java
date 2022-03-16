package com.github.zipcodewilmington.casino.games.blackjack;

import com.github.zipcodewilmington.casino.Game;
import com.github.zipcodewilmington.casino.GameEngine;
import com.github.zipcodewilmington.casino.Person;

import java.util.List;

public class BlackJackEngine extends GameEngine {

    public BlackJackEngine(Game game, List<BlackJackPlayer> players) {
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
