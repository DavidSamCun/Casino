package com.github.zipcodewilmington.casino.games.tictactoe;

import com.github.zipcodewilmington.casino.Game;
import com.github.zipcodewilmington.casino.GameEngine;
import com.github.zipcodewilmington.casino.Person;

import java.util.ArrayList;
import java.util.Scanner;

public class TicTacToeEngine  extends GameEngine<TicTacToePlayer,TicTacToeGame> {

    public TicTacToeEngine(TicTacToeGame game, ArrayList<TicTacToePlayer> players) {
       super(game,players);
    }


    public void start() {
        String result, move;
        Boolean gameOver = false;
        game.printBoard();
              while(!gameOver){
               for (int x = 0; x < players.size() ; x++) {
                    TicTacToePlayer player = players.get(x);
                    do {
                        move = player.getMove();
                        if (x == 0) {
                            result = game.turn(move, 'X');
                        } else {
                            result = game.turn(move, 'O');
                        }
                        if(result.equals("Not a valid Move")){
                            System.out.println(result);
                        }
                }while(result.equals("Not a valid Move"));
                   String win = getWinner(player);
                   if (win.equals("It is a tie")){
                       gameOver = true;
                       System.out.println(win);
                       break;
                   }
                   if (win.equals( "Winner is " + player.player.fName)) {
                       gameOver = true;
                       System.out.println(win);
                       break;
                   }
                   //ask if you want to exit
            }
        }
            replay();
    }

    public String moveO(TicTacToePlayer player, String move){
        char markerO = 'O';
        String result = game.turn(move, markerO);
        return result;
    }

    public TicTacToeGame getGame() {
       return this.game;


    public String getWinner(TicTacToePlayer player){
        if (game.isWinner()) {
          return "Winner is " + player.player.fName;
        }else if (game.boardFull())
            return "It is a tie";
        return " ";
    }

    public void exitGame() {
        super.exitGame();
    }

    public void replay() {;
         super.replay();
    }

     public static void main(String[] args){
        TicTacToeGame game = new TicTacToeGame();
        Person bob = new Person("", 550.00);
        bob.setfName("Bob");
        Person joe = new Person("", 660.00);
        joe.setfName("Joe");
        TicTacToePlayer bobT = new TicTacToePlayer(bob);
        TicTacToePlayer joeT = new TicTacToePlayer(joe);
        ArrayList<TicTacToePlayer> players = new ArrayList<>();
        players.add(bobT);
        players.add(joeT);
        GameEngine x = new TicTacToeEngine(game,players);
        x.start();
    }

//    public Iterable<Person> getPlayers() {
//    }
}
