package com.pluralsight.workbook5a.constructors.solutions;

// Workbook 5a p. 27
public class Dog extends Animal {
    private String breed;

    public Dog() {
        super(); // this call also happens if we don't write it
        System.out.println("Trace -- in Dog() class");
    }

    public Dog(String name, String breed) {
        super(name); // must be the first line
        System.out.println("Trace -- in Dog(name, breed) class w/ name");
        this.breed = breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void bark() {
        System.out.println("Ruff, ruff!");
    }
}
