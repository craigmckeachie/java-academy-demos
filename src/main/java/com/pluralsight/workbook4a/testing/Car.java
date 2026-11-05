package com.pluralsight.workbook4a.testing;

// Workbook 4a p. 34
public class Car {
    // attributes
    private String make;
    private String model;
    private int speed;

    // constructor
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
        this.speed = 0;
    }

    // getters and setters
    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return this.speed;
    }

    // no setter for speed

    // other methods
    public void accelerate(int changeInSpeed) {
        this.speed = this.speed + changeInSpeed;
    }

    public void brake(int changeInSpeed) {
        if (changeInSpeed > this.speed) {
            this.speed = 0;
        } else {
            this.speed = this.speed - changeInSpeed;
        }
    }
}
