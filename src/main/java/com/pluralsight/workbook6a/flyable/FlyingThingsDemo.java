package com.pluralsight.workbook6a.flyable;

import java.util.ArrayList;

public class FlyingThingsDemo {

    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();

        Airplane airplane = new Airplane();
        airplane.fly();

        Drone drone = new Drone();
        drone.fly();

        // TODO: one list of everything that can fly, and one loop that flies them all
    }
}
