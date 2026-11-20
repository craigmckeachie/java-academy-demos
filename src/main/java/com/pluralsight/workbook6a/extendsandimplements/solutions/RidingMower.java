package com.pluralsight.workbook6a.extendsandimplements.solutions;

// Workbook 6a p. 18
public class RidingMower extends Vehicle implements PowerTool {
    private String blade;

    public RidingMower(String make, String model, String blade) {
        super(make, model);
        this.blade = blade;
    }

    @Override
    public String getName() {
        return getMake() + " " + getModel() + " riding mower";
    }
}
