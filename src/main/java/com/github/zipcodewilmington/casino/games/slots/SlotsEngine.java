package com.github.zipcodewilmington.casino.games.slots;

import com.github.zipcodewilmington.casino.Game;
import com.github.zipcodewilmington.casino.GameEngine;
import com.github.zipcodewilmington.casino.Person;
import com.github.zipcodewilmington.casino.games.tictactoe.TicTacToeGame;
import com.github.zipcodewilmington.casino.games.tictactoe.TicTacToePlayer;

import java.util.ArrayList;
import java.util.List;

public class SlotsEngine extends GameEngine<SlotsPlayer, SlotsGame> {

    public SlotsEngine(SlotsGame game, ArrayList<SlotsPlayer> players) {
        super(game, players);
    }

    @Override
    public void start() {
        SlotsPlayer player = players.get(0);
        SlotsGame game = new SlotsGame();
        String inputString = "Play Again";
        Integer inputInt = 0;
        do {
            System.out.print("BWAAHWAHAHAHAAHA, BOWSER'S TERROR HAS ARRIVED!\n" +
                    "YOU'LL NEVER CAPTURE ME!\n");
           game.takeBet(player.placeBet("[5]  [10]  [20]  [50]  [100]"), "Place your bets >:D.\n\n");
            System.out.println("MUWAHAAHAAAHHAAA! ALRIGHT, LET'S SEE IF YOU CAN CATCH THE MIGHTY BOWSER!\n");
            System.out.println("[SPIN]");


            System.out.println("[Play Again] [Exit]");
            inputString = String.valueOf(player.userString);
        } while (inputString.equals("Play Again") || inputString.equals("play again"));
    }



    //gets new instance of Game
    @Override
    public SlotsGame getGame() {
        return null;
    }

    //stops the loop
    @Override
    public void exitGame() {
    }

    //replays the came, calls getGame
    @Override
    public void replay() {

    }

    public Iterable<Person> getPlayers() {
        return null;
    }
}
