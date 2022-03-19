package com.github.zipcodewilmington.casino.games.tictactoe;

import com.github.zipcodewilmington.casino.Game;
import com.github.zipcodewilmington.casino.GameEngine;
import com.github.zipcodewilmington.casino.Person;

import java.util.ArrayList;

public class TicTacToeEngine  extends GameEngine<TicTacToePlayer,TicTacToeGame> {

    public TicTacToeEngine(TicTacToeGame game, ArrayList<TicTacToePlayer> players) {
       super(game,players);
    }


    public void start() {
        String result;
        char markerX = 'X', markerO = 'O';
        String move;
            game.printBoard();
            while (!game.isWinner() || (!game.boardFull())) {
               for (int x = 0; x < players.size(); x++) {
                    TicTacToePlayer player = players.get(x);
                    do {
                        move = player.getMove();
                        if (x == 0) {
                            result = game.turn(move, markerX);
                            if(game.isWinner()){
                                System.out.println("Winner is "+player.player.fName);
                                return ;
//                           result =  moveX(player,move);
//                            if(!(getWinner(player).equals(" "))) {
//                                System.out.println(getWinner(player));
//                                return;
//                            }

                            }
                        } else {
                           // result = moveO(player,move);
                            result = game.turn(move, markerO);
                            if(game.isWinner()){
                                System.out.println("Winner is " +player.player.fName);
                                return ;
                            }
//                           if(!getWinner(player).equals(" ")) {
//                               System.out.println(getWinner(player));
//                           }
                        }
                        if(result.equals("Not a valid Move")){
                            System.out.println(result);
                        }
                        else if (result.equals("Board Full")) {
                            break;
                        }
                }while(result.equals("Not a valid Move"));
                //ask if you want to exit

            }
        }
        System.out.println("It is a tie");
    }

    public String moveX(TicTacToePlayer player, String move) {
        char markerX = 'X';
        String result = game.turn(move, markerX);
        return result;
    }

    public String moveO(TicTacToePlayer player, String move){
        char markerO = 'O';
        String result = game.turn(move, markerO);
        return result;
    }

    public Game getGame() {
       return this.game;
    }

    public String getWinner(TicTacToePlayer player){
        String winner;
        if (game.isWinner()) {
          winner =  "Winner is " + player.player.fName;
        }else if (game.boardFull())
            winner = "it's a tie!";
        return " ";
    }

    public void exitGame() {


    }

    public void replay() {

    }

     public static void main(String[] args){
        TicTacToeGame game = new TicTacToeGame();
        Person bob = new Person();
        bob.setfName("Bob");
        Person joe = new Person();
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
