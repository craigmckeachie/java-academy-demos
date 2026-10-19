package com.pluralsight.workbook2a.objects;

public class Person {
    private String name;
    private int age;
    // TODO: an energy field -- every person starts with 100

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

    // TODO: a getter for energy (but NO setter)

    // TODO: actions that change energy: work(int hours), sleep(int hours), eat()
}
