package com.github.zipcodewilmington.casino.games.roulette;

import com.github.zipcodewilmington.casino.Game;
import com.github.zipcodewilmington.casino.GameEngine;
import com.github.zipcodewilmington.casino.Person;
import com.github.zipcodewilmington.casino.games.tictactoe.TicTacToeEngine;
import com.github.zipcodewilmington.casino.games.tictactoe.TicTacToeGame;
import com.github.zipcodewilmington.casino.games.tictactoe.TicTacToePlayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RouletteEngine extends GameEngine<RoulettePlayer,RouletteGame> {

    public RouletteEngine(RouletteGame game, List<RoulettePlayer> players) {
        super(game, players);
    }


    public void start() {
        //get bet
        int bet;
        int num = 0;
        int numberChosen = 0;
        boolean marker = false;
        //spin wheeel
        //reward
        // while (!game.isWinner()) {
        //for (int x = 0; x < players.size(); x++) {
            RoulettePlayer player = players.get(0);
            //take bet
            numberChosen = player.makeMove();
        //}
            Integer x =game.turn(num,marker);
            if(game.betWon(numberChosen)) {
                System.out.println("You won");
            }else System.out.println("You lose. Correct number was: "+x);
        replay();
        //spin wheel
       // int result = game.turn(num, marker);
        //check who won
        //for (RoulettePlayer player: game.numPicks.keySet()) {
            //game.isWinner();
       // }
        // update funds
    }




    public RouletteGame getGame() {
        return new RouletteGame();
    }


    public void exitGame() {
       // Do you want to exit
        //Do you have enough money to bet
       super.exitGame();
    }


    public void replay() {
        //do you want to play again
        //do you have enough money to bet
        String input;
        //Play Again?
        Scanner scanner = new Scanner(System.in);
        // try{
        System.out.println(" Play again? (Y/N): ");
        input = scanner.nextLine();
        if(input.toUpperCase().equals("Y") ||(input.toUpperCase().equals("YES"))){
            this.game = getGame();
            this.start();
        }else exitGame();

    }


    public Iterable<Person> getPlayers() {
        return null;
    }

    public static void main(String[] args) {
        RouletteGame game = new RouletteGame();
        Person bob = new Person();
        bob.setfName("Bob");
        ArrayList<RoulettePlayer> players = new ArrayList<>();
        RoulettePlayer bobT = new RoulettePlayer(bob);
        players.add(bobT);
        GameEngine x = new RouletteEngine(game, players);
        x.start();
    }
}
