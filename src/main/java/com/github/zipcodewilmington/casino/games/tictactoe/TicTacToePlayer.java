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
      int x=0,y=0;
      Scanner scanner = new Scanner(System.in);
     // try{
          System.out.println(player.fName +" Please enter where you want to move(0-2)(eg 0 0):");
          String input = scanner.nextLine();
          return input;
//          String[] arrayString = input.split(" ");
//          x = Integer.valueOf(arrayString[0]);
//          y = Integer.valueOf(arrayString[1]);
    //  }catch (InputMismatchException e){
       //   System.out.println(" "+scanner.next()+ " isn't a number!");
    //  }
    //  try{
//          System.out.println("Please enter a row number:");
//         int  y = scanner.nextInt();
    //  }catch (InputMismatchException e){
     //     System.out.println(" "+scanner.next()+ " isn't a number!");
     // }
      //ask for move
      //scanner.close();

     // return new int[]{x,y};
  }
}
