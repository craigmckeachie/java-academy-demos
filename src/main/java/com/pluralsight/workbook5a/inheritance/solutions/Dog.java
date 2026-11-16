package com.pluralsight.workbook5a.inheritance.solutions;

// Workbook 5a p. 16
public class Dog extends Animal {
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
