package com.pluralsight.workbook6a.workingwithinterfaces.solutions;

// Workbook 6a p. 28
public class RobotVacuum implements Movable, Cleaner {

    @Override
    public void move(int xUnits, int yUnits) {
        System.out.println("The vacuum moves " + xUnits + " right and " + yUnits + " up.");
    }

    @Override
    public void goHome() {
        System.out.println("The vacuum goes back to its charger.");
    }

    @Override
    public void clean() {
        System.out.println("The robot vacuum sucks up the dust.");
    }
}
