package com.github.zipcodewilmington.casino;

import com.github.zipcodewilmington.casino.games.tictactoe.TicTacToePlayer;

import java.util.ArrayList;
import java.util.List;

public abstract class GameEngine <PlayerType extends PlayerInterface> implements GameEngineInterface {
    private Game game;
    private List<PlayerType> players;

    public GameEngine(Game game, ArrayList<PlayerType> players) {
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
