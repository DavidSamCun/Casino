package com.github.zipcodewilmington.casino;

public class Person implements PlayerInterface{

    public String name;
    public int funds;
    public String fName;
    public String lName;

    //Scanner scanner = new Scanner(System.in);
    public Person(String name, int funds){
        this.name = name;
        this.funds = funds;
    }

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




    public CasinoAccount getArcadeAccount() {
       return null;
    }
    public <SomeReturnType> SomeReturnType play() {
        return null;
    }
}
