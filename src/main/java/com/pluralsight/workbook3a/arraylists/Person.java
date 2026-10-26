package com.pluralsight.workbook3a.arraylists;

// Workbook 2a p. 37 (the Person class from the classes demo)

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}
