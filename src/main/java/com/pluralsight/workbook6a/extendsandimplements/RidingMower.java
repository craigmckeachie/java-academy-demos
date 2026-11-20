package com.pluralsight.workbook6a.extendsandimplements;

// Workbook 6a p. 18
// TODO: a riding mower is also a power tool
public class RidingMower extends Vehicle {
    private String blade;

    public RidingMower(String make, String model, String blade) {
        super(make, model);
        this.blade = blade;
    }

    public String getName() {
        return getMake() + " " + getModel() + " riding mower";
    }
}
