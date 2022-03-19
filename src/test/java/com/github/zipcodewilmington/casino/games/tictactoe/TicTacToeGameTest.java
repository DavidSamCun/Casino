package com.github.zipcodewilmington.casino.games.tictactoe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeGameTest {

    @Test
    void printBoard() {
        TicTacToeGame tt = new TicTacToeGame();
        tt.board = new Character[][]{{'X', 'O', 'X'},
                {'O', 'O', 'X'},
                {'X', 'X', 'O'}};
        tt.printBoard();
    }

    @Test
    void turn() {
        TicTacToeGame tt = new TicTacToeGame();
        tt.turn("1 1",'X');
        tt.printBoard();
    }
}