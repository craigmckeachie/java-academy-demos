package com.pluralsight.workbook6a.workingwithinterfaces;

// Workbook 6a p. 32 (a Person can't move, draw or clean, as far as Java knows)
public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
