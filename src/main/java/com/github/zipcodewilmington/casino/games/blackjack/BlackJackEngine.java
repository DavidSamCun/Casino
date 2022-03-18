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



//    public void addPlayer(Person player){
//        this.
//    }

    @Override
    public void start() {



    }

    @Override
    public Game getGame() {
        return new BlackJackGame();
    }

    @Override
    public void exitGame() {

    }

    @Override
    public void replay() {

    }


    public Iterable<Person> getPlayers() {
        return null;
    }
}
