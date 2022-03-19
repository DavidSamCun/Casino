package com.github.zipcodewilmington.casino.games.tictactoe;

import com.github.zipcodewilmington.casino.Game;

public class TicTacToeGame extends Game<String,Character> {
    Character [][] board;

    public TicTacToeGame(){
        board = new Character[][]{{' ', ' ', ' '}, {' ', ' ', ' '},{' ',' ',' '}};
    }

    @Override
    public boolean isWinner() {

        if(isInFavorOfX() || isInFavorOfO()){
            return true;
        }
        return false;
    }

    @Override
    public String turn(String move, Character marker) {
        String[] arrayString = move.split(" ");
        int x = Integer.valueOf(arrayString[0]);
        int y = Integer.valueOf(arrayString[1]);
        if (!boardFull()) {
            if (board[x][y] == ' ') {
                board[x][y] = marker;
                printBoard();
            } else return "Not a valid Move";
            // return to play
        }else return "Board Full";
        return "Move Complete";
    }

//    public String turn(int[] move, char marker){
//        //player turn pick a square update the board
//        printBoard();
//        if (!boardFull()) {
//            if (board[move[0]][move[1]] == ' ') {
//                board[move[0]][move[1]] = marker;
//            } else return "Not a valid Move";
//            // return to play
//        }else return "Board Full";
//        return "Move Complete";
//    }

    public  void board(Character[][] matrix) {
        board = matrix;
    }

    public boolean boardFull(){
        boolean foundNull = true;
        while(foundNull){
            for(int i =0; i<=2;i++){
                for(int j = 0; j<=2;j++){
                    if(board[i][j] == ' ') {
                        foundNull = false;
                    }
                }
            }
            break;
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

     public void printBoard() {
         for (int i = 0; i <= 2; i++) {
             for (int j = 0; j <= 2; j++) {
                 if (board[i][j] != null) {
                     System.out.print(board[i][j] + "");
                 } else System.out.println(" ");
                 if (j < 2) {
                     System.out.print("|");
                 }

             }
             if (i < 2) {
                 System.out.println("\n-+-+-");
             }
         }
         System.out.println("\n");
     }

}
