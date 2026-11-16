package com.pluralsight.workbook5a.constructors;

// Workbook 5a pp. 24 and 27
public class Dog extends Animal {
    private String breed;

    // TODO: a constructor that takes a name and a breed

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
