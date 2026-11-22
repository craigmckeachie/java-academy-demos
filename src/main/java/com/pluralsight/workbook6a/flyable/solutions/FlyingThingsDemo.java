package com.pluralsight.workbook6a.flyable.solutions;

import java.util.ArrayList;

public class FlyingThingsDemo {

    public static void main(String[] args) {
        ArrayList<Flyable> flyingThings = new ArrayList<>();
        flyingThings.add(new Bird());
        flyingThings.add(new Airplane());
        flyingThings.add(new Drone());

        for (Flyable thing : flyingThings) {
            thing.fly();
            if (thing instanceof Bird bird) {
                bird.buildNest();
            }
        }
    }
}
