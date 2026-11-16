package com.pluralsight.workbook5a.inheritance;

// Workbook 5a p. 16
// TODO: make Dog inherit from Animal
public class Dog {
    private String breed;

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
