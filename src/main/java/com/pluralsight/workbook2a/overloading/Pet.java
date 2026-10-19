package com.pluralsight.workbook2a.overloading;

public class Pet {
    private String name;
    private String species;
    private int age;
    private int treatsToday;

    // 2-1: constructor with no parameters -- sets default values
    public Pet() {
        this.name = "";
        this.species = "";
        this.age = 0;
        this.treatsToday = 0;
    }

    // 2-1: getters and setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return this.species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 2-2: getter only -- treats can only change through giveTreat()
    public int getTreatsToday() {
        return this.treatsToday;
    }

    // 2-2: action methods
    public void giveTreat() {
        this.treatsToday++;
    }

    public String speak() {
        if (this.species.equals("dog")) {
            return "Woof!";
        } else if (this.species.equals("cat")) {
            return "Meow!";
        } else {
            return "...";
        }
    }
}
