package com.github.zipcodewilmington.casino.games.tictactoe;

import com.github.zipcodewilmington.casino.GameEngine;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeEngineTest {

    @Test
    void start() {
        TicTacToeGame game = new TicTacToeGame();
        TicTacToePlayer bob = new TicTacToePlayer();
        TicTacToePlayer joe = new TicTacToePlayer();
        ArrayList<TicTacToePlayer> players = new ArrayList<>();
        players.add(bob);
        players.add(joe);
        GameEngine x = new TicTacToeEngine(game,players);
        x.start();
    }
}