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
            while (!game.isWinner() || (game.boardFull())) {
               for (int x = 0; x < players.size(); x++) {
                    TicTacToePlayer player = players.get(x);
                    do {
                        move = player.getMove();
                        if (x == 0) {
                            result = game.turn(move, markerX);
                            String win = getWinner(player);
                            System.out.print(win);
                            if (win.equals( "Winner is " + player.player.fName)||win.equals("it's a tie!"))
                                return;
                        } else {
                            result = game.turn(move, markerO);
                            String win = getWinner(player);
                            System.out.print(win);
                            if (win.equals( "Winner is " + player.player.fName) ||win.equals("it's a tie!"))
                                return;
                        }
                        if(result.equals("Not a valid Move")){
                            System.out.println(result);
                        }
                }while(result.equals("Not a valid Move"));
                //ask if you want to exit

            }

        }
        System.out.println("It is a tie");
    }

    public Game getGame() {
       return this.game;
    }

    public String getWinner(TicTacToePlayer player){
        if (game.isWinner()) {
          return "Winner is " + player.player.fName;
        }else if (game.boardFull())
            return "it's a tie!";
        return " ";
    }

    public void exitGame() {
      // Exit game return to casino

    }

    public void replay() {
        //Play Again?

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
