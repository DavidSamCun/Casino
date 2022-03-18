package com.github.zipcodewilmington.casino.games.blackjack;

import com.github.zipcodewilmington.casino.Game;
import com.github.zipcodewilmington.casino.GameEngine;
import com.github.zipcodewilmington.casino.Person;
import com.github.zipcodewilmington.casino.games.tictactoe.TicTacToeGame;
import com.github.zipcodewilmington.casino.games.tictactoe.TicTacToePlayer;

import java.util.ArrayList;
import java.util.List;

public class BlackJackEngine extends GameEngine {

    public BlackJackEngine(BlackJackGame game, ArrayList<BlackJackPlayer> players) {
        super(game, players);
    }


    boolean gameOver = false;
    //Game blackJack = getGame();
    BlackJackGame blackJack = new BlackJackGame();

    @Override
    public void start() {
        gameOver = false;
    }

    @Override
    public Game getGame() {
        return new BlackJackGame();
    }

    @Override
    public void exitGame() {
        gameOver = true;
    }

    @Override
    public void replay() {

    }


    public void playingGame(){
        while (!gameOver){
        }
    }


    public Iterable<Person> getPlayers() {
        return null;
    }
}
