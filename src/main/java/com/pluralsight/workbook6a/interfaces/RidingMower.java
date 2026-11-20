package com.pluralsight.workbook6a.interfaces;

// Workbook 6a p. 17
// TODO: a riding mower can be driven AND is a power tool
public class RidingMower {
    private String make;
    private String model;
    private String blade;

    public RidingMower(String make, String model, String blade) {
        this.make = make;
        this.model = model;
        this.blade = blade;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getName() {
        return make + " " + model + " riding mower";
    }

    public void turnOn() {
        System.out.println("The " + make + " " + model + " starts up.");
    }

    public void repair() {
        System.out.println("Sharpening the " + blade + " blade and checking the engine.");
    }
}
