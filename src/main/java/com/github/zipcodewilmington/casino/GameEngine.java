package com.github.zipcodewilmington.casino;

import java.util.List;

public abstract class GameEngine implements GameEngineInterface {
    private Game game;
    private List<Person> players;

    public GameEngine(Game game, List<Person> players) {
        this.game = game;
        this.players = players;
    }

    @Override
    public void replay() {

    }

    @Override
    public Game getGame() {
        return game;
    }

    @Override
    public void exitGame() {

    }

    public void start(){

    }

}
