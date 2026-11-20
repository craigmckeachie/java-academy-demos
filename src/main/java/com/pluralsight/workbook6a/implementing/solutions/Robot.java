package com.pluralsight.workbook6a.implementing.solutions;

// Workbook 6a p. 25
public class Robot implements Movable {
    private String name;
    private Point currentLocation;
    private int power;

    public Robot(String name) {
        this.name = name;
        this.currentLocation = new Point(0, 0);
        this.power = 100;
    }

    public String getName() {
        return name;
    }

    public Point getCurrentLocation() {
        return currentLocation;
    }

    public int getPower() {
        return power;
    }

    @Override
    public Point move(int xUnits, int yUnits) {
        // a robot only moves if it has enough power for the bigger move
        int biggestUnit = xUnits;
        if (yUnits > xUnits) {
            biggestUnit = yUnits;
        }

        if (power >= biggestUnit) {
            currentLocation.setX(currentLocation.getX() + xUnits);
            currentLocation.setY(currentLocation.getY() + yUnits);
            power = power - biggestUnit;
        }

        return currentLocation;
    }

    @Override
    public void goHome() {
        currentLocation = new Point(0, 0);
    }
}
