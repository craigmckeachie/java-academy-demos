package com.pluralsight.workbook6a.interfacetype.solutions;

public class InterfaceTypeDemo {

    public static void main(String[] args) {
        Helicopter helicopter = new Helicopter();
        helicopter.fly();

        Drone drone = new Drone();
        drone.fly();
        drone.charge();

        // one variable, anything that can fly
        Flyable flyer = new Drone();
        flyer.fly();

        flyer = new Bird();
        flyer.fly();
    }
}
