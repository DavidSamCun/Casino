package com.github.zipcodewilmington.casino;

import java.util.ArrayList;

public interface GameEngineInterface {

//     PlayerType extends Person;

    //Starts game
     void start();
     //calls the game to play
     Game getGame();
     //exits game and returns player to casino floor
     void exitGame();
     //continue playing the same game
     void replay();
}
