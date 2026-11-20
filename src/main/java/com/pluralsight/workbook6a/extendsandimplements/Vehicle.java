package com.pluralsight.workbook6a.extendsandimplements;

// Workbook 6a p. 18
// TODO: every vehicle can be driven
public class Vehicle {
    private String make;
    private String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public void turnOn() {
        System.out.println("The " + make + " " + model + " starts up.");
    }

    public void repair() {
        System.out.println("Checking the " + make + " " + model + "'s engine.");
    }
}
