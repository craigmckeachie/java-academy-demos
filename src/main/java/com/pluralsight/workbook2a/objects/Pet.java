package com.pluralsight.workbook2a.objects;

public class Pet {
    private String name;
    private String species;
    private int age;

    public Pet() {
        this.name = "";
        this.species = "";
        this.age = 0;
    }

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
}
