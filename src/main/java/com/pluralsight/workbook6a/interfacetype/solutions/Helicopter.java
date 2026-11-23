package com.pluralsight.workbook6a.interfacetype.solutions;

public class Helicopter implements Flyable {

    @Override
    public void fly() {
        System.out.println("The helicopter's blades spin, and it lifts straight up.");
    }
}
