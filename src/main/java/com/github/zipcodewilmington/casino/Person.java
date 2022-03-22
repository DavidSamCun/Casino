package com.github.zipcodewilmington.casino;

public class Person implements PlayerInterface{

    private String name;
    private int funds;

    //Scanner scanner = new Scanner(System.in);
    public Person(String name, int funds){
        this.name = name;
        this.funds = funds;
    }

    public int getFunds() {
        return funds;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }





    public CasinoAccount getArcadeAccount() {
       return null;
    }
    public <SomeReturnType> SomeReturnType play() {
        return null;
    }
}
