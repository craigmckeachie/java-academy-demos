package com.pluralsight.workbook6a.implementing.solutions;

// Workbook 6a p. 24
public class Turtle implements Movable {
    private String name;
    private Point currentLocation;

    public Turtle(String name) {
        this.name = name;
        this.currentLocation = new Point(25, 25);
    }

    public String getName() {
        return name;
    }

    public Point getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public Point move(int xUnits, int yUnits) {
        currentLocation.setX(currentLocation.getX() + xUnits);
        currentLocation.setY(currentLocation.getY() + yUnits);
        return currentLocation;
    }

    @Override
    public void goHome() {
        currentLocation = new Point(25, 25);
    }
}
