package com.pluralsight.workbook6a.extendsandimplements.solutions;

// Workbook 6a p. 18
public class Vehicle implements Drivable {
    private String make;
    private String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public void turnOn() {
        System.out.println("The " + make + " " + model + " starts up.");
    }

    @Override
    public void repair() {
        System.out.println("Checking the " + make + " " + model + "'s engine.");
    }
}
