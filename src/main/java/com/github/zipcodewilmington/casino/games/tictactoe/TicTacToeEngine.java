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
        String result;
        String move;
        game.printBoard();
            while (!(game.isWinner()) || (game.boardFull())) {
               for (int x = 0; x < players.size() ; x++) {
                    TicTacToePlayer player = players.get(x);
                    do {
                        move = player.getMove();
                        if (x == 0) {
                            result = game.turn(move, 'X');
                            String win = getWinner(player);
                            System.out.println(win);
                            if ((win.equals( "Winner is " + player.player.fName))||(win.equals("it's a tie!"))) {
                                break;
                            }
                        } else {
                            result = game.turn(move, 'O');
                            String win = getWinner(player);
                            System.out.println(win);
                            if ((win.equals( "Winner is " + player.player.fName))|| (win.equals("it's a tie!")))
                                break;
                        }
                        if(result.equals("Not a valid Move")){
                            System.out.println(result);
                        }
                }while(result.equals("Not a valid Move"));
                //ask if you want to exit

            }

        }
            replay();

    }

    public Game getGame() {
       return this.game = new TicTacToeGame();
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
        System.out.println("Thank you for playing!");
    }

    public void replay() {
        String input;
        //Play Again?
        Scanner scanner = new Scanner(System.in);
        // try{
        System.out.println(" Play again? (Y/N): ");
        input = scanner.nextLine();
        if(input.toUpperCase().equals("Y") ||(input.toUpperCase().equals("YES"))){
            this.getGame();
            this.start();
        }else exitGame();

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
