package com.github.zipcodewilmington.casino;

import com.github.zipcodewilmington.casino.games.tictactoe.TicTacToePlayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class GameEngine <PlayerType,GameType extends Game> implements GameEngineInterface {
    public GameType game;
    public List<PlayerType> players = new ArrayList<>();

    public GameEngine(GameType game, List<PlayerType> players) {
        this.game = game;
        for(PlayerType p :players)
            this.players.add(p);
    }

    @Override
    public void replay() {
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

    @Override
    public abstract GameType getGame();

    @Override
    public void exitGame() {
        System.out.println("Thank you for playing!");
    }

    public abstract void start();

}