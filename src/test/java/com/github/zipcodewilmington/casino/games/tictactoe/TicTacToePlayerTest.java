package com.github.zipcodewilmington.casino.games.tictactoe;

import com.github.zipcodewilmington.casino.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToePlayerTest {

    @Test
    void getMove() {
        Person p = new Person();
        TicTacToePlayer t = new TicTacToePlayer(p);
        String result = "";
        result = t.getMove();
    }
}