package com.github.zipcodewilmington.casino;

public abstract class Game<T,S> {
    // determine if there is a winner
    public abstract boolean isWinner();

    //players take turns
    public abstract String turn(T move,S marker);
    //

}
