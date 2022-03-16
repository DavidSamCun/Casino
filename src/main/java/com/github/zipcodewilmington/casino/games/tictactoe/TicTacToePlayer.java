package com.github.zipcodewilmington.casino.games.tictactoe;

import com.github.zipcodewilmington.casino.Person;
import com.github.zipcodewilmington.casino.PlayerInterface;

public class TicTacToePlayer implements PlayerInterface {
   public Person player;
  public void TicTacToePlayer(Person player){
      this.player = player;
  }
}
