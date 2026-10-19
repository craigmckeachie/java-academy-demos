package com.pluralsight.workbook2a.objects;

// Workbook 2a p. 46
public class Person {
    private String name;
    private int age;
    private int energy;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.energy = 100;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getEnergy() {
        return this.energy;
    }

    // TODO: work(int hours): lose 10 energy per hour

    public void sleep(int hours) {
        this.energy += (hours * 10);
    }

    public void eat() {
        this.energy += 20;
    }
}
