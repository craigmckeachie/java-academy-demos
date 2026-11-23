package com.pluralsight.workbook6a.interfacecheck.solutions;

public class Airplane implements Flyable {

    @Override
    public void fly() {
        System.out.println("The airplane speeds down the runway and lifts into the sky.");
    }

    public void refuel() {
        System.out.println("The airplane fills up with fuel.");
    }
}
