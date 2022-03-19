package com.github.zipcodewilmington.casino;

import com.github.zipcodewilmington.casino.games.tictactoe.TicTacToePlayer;

import java.util.ArrayList;
import java.util.List;

public abstract class GameEngine <PlayerType,GameType extends Game> implements GameEngineInterface {
    public GameType game;
    public List<PlayerType> players = new ArrayList<>();

    public GameEngine(GameType game, List<PlayerType> players) {
        this.game = game;
        for(PlayerType p :players)
        this.players.add(p);
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
