package com.github.zipcodewilmington.casino;

public class Person implements PlayerInterface{

    public int getFunds() {
        return funds;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String fName;
    private String lName;
    private int funds;



    public CasinoAccount getArcadeAccount() {
       return null;
    }
    public <SomeReturnType> SomeReturnType play() {
        return null;
    }
}
