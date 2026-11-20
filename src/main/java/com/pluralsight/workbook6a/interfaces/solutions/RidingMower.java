package com.pluralsight.workbook6a.interfaces.solutions;

// Workbook 6a p. 17
public class RidingMower implements Drivable, PowerTool {
    private String make;
    private String model;
    private String blade;

    public RidingMower(String make, String model, String blade) {
        this.make = make;
        this.model = model;
        this.blade = blade;
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
    public String getName() {
        return make + " " + model + " riding mower";
    }

    @Override
    public void turnOn() {
        System.out.println("The " + make + " " + model + " starts up.");
    }

    @Override
    public void repair() {
        System.out.println("Sharpening the " + blade + " blade and checking the engine.");
    }
}
