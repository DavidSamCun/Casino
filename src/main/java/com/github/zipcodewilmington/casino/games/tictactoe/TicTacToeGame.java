package com.github.zipcodewilmington.casino.games.tictactoe;

import com.github.zipcodewilmington.casino.Game;

public class TicTacToeGame extends Game {
    private Character [][] board;

    @Override
    public boolean isWinner() {

        if(isInFavorOfX() || isInFavorOfO()){
            return true;
        }
        return super.isWinner();
    }
    public void turn(){
        //player turn pick a square update the board
        // cpu turn pick a remaining spot

        // return to play
    }


    public  void board(Character[][] matrix) {
        board = matrix;
    }

    public Boolean checkRows(char answer) {
        int xs = 0;
        for(int i = 0; i <=2; i++){
            for (int j = 0; j <= 2;j++){
                if (board[i][j] == answer)
                    xs++;
            }
            if (xs == 3){
                return true;
            }else xs =0;
        }
        return false;
    }

    boolean checkColumns(char answer){
        int xs = 0;
        for(int i = 0; i <=2; i++){
            for (int j = 0; j <= 2;j++){
                if (board[j][i] == answer)
                    xs++;
            }
            if (xs == 3){
                return true;
            }else xs = 0;
        }
        return false;
    }

    boolean checkDiagonals(char answer){
        int xs = 0;
        for(int i = 0; i <=2; i++){
            if (board[i][i] == answer)
                xs++;
        }
        if (xs == 3){
            return true;
        } else return (board[2][0] == answer) && (board[1][1] == answer) && (board[0][2] == answer);
    }

    public Boolean isInFavorOfX() {
        if(checkRows('X'))
            return true;
        else if (checkColumns('X'))
            return true;
        else if (checkDiagonals('X'))
            return true;
        else
            return false;
    }

    public Boolean isInFavorOfO() {
        if(checkRows('O'))
            return true;
        else if (checkColumns('O'))
            return true;
        else if (checkDiagonals('O'))
            return true;
        else
            return false;

    }

    public Boolean isTie() {
        if(isInFavorOfO() || isInFavorOfX()){
            return false;
        }else return true;
    }

    public String getWinner() {
        if(!isTie()){
            if(isInFavorOfX()) {
                return "X";
            }else if (isInFavorOfO()) {
                return "O";
            }
        }
        return "Tie";
    }


}
