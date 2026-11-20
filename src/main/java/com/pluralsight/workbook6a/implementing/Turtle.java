package com.pluralsight.workbook6a.implementing;

// Workbook 6a p. 24
// TODO: a Turtle is Movable
public class Turtle {
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
}
