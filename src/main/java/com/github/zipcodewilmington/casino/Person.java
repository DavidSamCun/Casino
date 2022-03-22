package com.github.zipcodewilmington.casino;

public class Person {
    public String fName;
    private String lName;


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

    public void setFunds(int funds) {
        this.funds = funds;
    }

    private int funds;

    public CasinoAccount getArcadeAccount() {
        return null;
    }
    public <SomeReturnType> SomeReturnType play() {
        return null;
    }
}