package com.github.zipcodewilmington.casino.games.baccarat;

import com.github.zipcodewilmington.casino.Game;
import com.github.zipcodewilmington.casino.GameEngine;
import com.github.zipcodewilmington.casino.GameEngineInterface;
import com.github.zipcodewilmington.casino.Person;

import java.util.ArrayList;
import java.util.List;

public class BaccaratEngine extends GameEngine {

    public BaccaratEngine(BaccaratGame game, ArrayList<BaccaratPlayer> players) {
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


}
