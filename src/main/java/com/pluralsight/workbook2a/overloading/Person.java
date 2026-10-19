package com.pluralsight.workbook2a.overloading;

// Workbook 2a p. 53

public class Person {
    private String name;
    private int age;

    // TODO: a constructor with no parameters

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
