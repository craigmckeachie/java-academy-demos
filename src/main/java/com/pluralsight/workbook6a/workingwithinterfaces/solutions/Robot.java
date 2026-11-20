package com.pluralsight.workbook6a.workingwithinterfaces.solutions;

// Workbook 6a p. 28
public class Robot implements Movable {

    @Override
    public void move(int xUnits, int yUnits) {
        System.out.println("The robot rolls " + xUnits + " right and " + yUnits + " up.");
    }

    @Override
    public void goHome() {
        System.out.println("The robot rolls home.");
    }
}
