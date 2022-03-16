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
    public String turn(int[] move){
        //player turn pick a square update the board
        if (boardNotFull()) {
            if (board[move[0]][move[1]] == ' ') {
                board[move[0]][move[1]] = 'X';
            } else return "Not a valid Move";

            if (!isInFavorOfX()) {
                //cpu takes a move
                board[2][2] = 'O';
            }
            // return to play
        }else return "Board Full";
        return "";
    }

    public int[] cpuMove(){
        int y = 0;
        for(int x =0; x<2;x++){
            if(board[y][x]=='O'&&board[y+1][x] == 'O'){
                if(board[y+3][x] == null){
                    board[y+3][x] = 'O';
                }
            }
        }


        if (board[1][1] == null) {
            return new int []{1,1};
        }
        return new int[] {0,0};
        }


    public  void board(Character[][] matrix) {
        board = matrix;
    }

    public boolean boardNotFull(){
        boolean foundNull = false;
        while(!foundNull){
            for(int i =0; i<=2;i++){
                for(int j = 0; j<=2;j++){
                    if(board[i][j] == null)
                        return true;
                }
            }
        }
        return foundNull;
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

     public void printBoard(){

     }
}
