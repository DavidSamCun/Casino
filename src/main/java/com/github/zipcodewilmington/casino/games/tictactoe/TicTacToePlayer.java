package com.github.zipcodewilmington.casino.games.tictactoe;

import com.github.zipcodewilmington.casino.Person;
import com.github.zipcodewilmington.casino.PlayerInterface;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToePlayer implements PlayerInterface {
   public Person player;
  public void TicTacToePlayer(Person player){
      this.player = player;
  }
  public int[] getMove() {
      Scanner scanner = new Scanner(System.in);
      int x =0, y =0;
      try{
          System.out.println("Please enter a column number: ");
          x = scanner.nextInt();
      }catch (InputMismatchException e){
          System.out.println(" "+scanner.next()+ " isn't a number!");
      }
      try{
          System.out.println("Please enter a column number: ");
          y = scanner.nextInt();
      }catch (InputMismatchException e){
          System.out.println(" "+scanner.next()+ " isn't a number!");
      }
      //ask for move
      return new int[]{x,y};
  }
}
