package com.pluralsight.workbook5a.constructors;

// Workbook 5a p. 26
public class Animal {
    private String name;

    public Animal() {
        System.out.println("Trace -- in Animal() class");
    }

    public Animal(String name) {
        System.out.println("Trace -- in Animal(name) class w/ name");
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
