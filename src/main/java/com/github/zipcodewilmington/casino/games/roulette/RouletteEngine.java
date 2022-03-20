package com.github.zipcodewilmington.casino.games.roulette;

import com.github.zipcodewilmington.casino.Game;
import com.github.zipcodewilmington.casino.GameEngine;
import com.github.zipcodewilmington.casino.Person;
import com.github.zipcodewilmington.casino.games.tictactoe.TicTacToePlayer;

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
        int numberChosen;
        boolean marker = false;
        //spin wheeel
        //reward
        // while (!game.isWinner()) {
        int x;
        for (x = 0; x < players.size(); x++) {
            RoulettePlayer player = players.get(x);
            //take bet
            numberChosen = player.makeMove();
            game.numPicks.add(x,numberChosen);
        }
        //spin wheel
        int result = game.turn(num, marker);
        //check who won
        for (x = 0; x < players.size(); x++) {
            RoulettePlayer player = players.get(x);
            game.isWinner();
        }
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
}
