package com.pluralsight.workbook6a.flyable.solutions;

public class Drone implements Flyable, Rechargeable {

    @Override
    public void fly() {
        System.out.println("The drone hovers, then zips through the air.");
    }

    @Override
    public void charge() {
        System.out.println("The drone charges its battery.");
    }

    public void streamVideo() {
        System.out.println("The drone streams video to your phone.");
    }
}
