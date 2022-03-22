package com.github.zipcodewilmington.casino.games.tictactoe;

import com.github.zipcodewilmington.casino.Person;
import com.github.zipcodewilmington.casino.PlayerInterface;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToePlayer {
   public Person player;
  public TicTacToePlayer(Person player){
      this.player = player;
  }



  public String getMove() {
      Scanner scanner = new Scanner(System.in);
     // try{
          System.out.println(player.fName +" Please enter where you want to move(0-2)(eg 0 0):");
          String input = scanner.nextLine();
          return input;
    //  }catch (InputMismatchException e){
       //   System.out.println(" "+scanner.next()+ " isn't a number!");
    //  }
    //  try{
//          System.out.println("Please enter a row number:");
//         int  y = scanner.nextInt();
    //  }catch (InputMismatchException e){
     //     System.out.println(" "+scanner.next()+ " isn't a number!");
     // }
      //scanner.close();
  }
}
