package com.github.zipcodewilmington.casino.games.tictactoe;

import com.github.zipcodewilmington.casino.GameEngine;
import com.github.zipcodewilmington.casino.Person;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeEngineTest {

    @Test
    void start() {
        Person bob1 = new Person();
        Person joe1 = new Person();
        TicTacToeGame game = new TicTacToeGame();
        TicTacToePlayer bob = new TicTacToePlayer(bob1);
        TicTacToePlayer joe = new TicTacToePlayer(joe1);
        ArrayList<TicTacToePlayer> players = new ArrayList<>();
        players.add(bob);
        players.add(joe);
        GameEngine x = new TicTacToeEngine(game,players);
        x.start();
    }
}