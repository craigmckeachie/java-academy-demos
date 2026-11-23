package com.pluralsight.workbook6a.interfacecheck;

public class Bird implements Flyable {

    @Override
    public void fly() {
        System.out.println("The bird flaps its wings and takes off.");
    }

    public void buildNest() {
        System.out.println("The bird builds a nest.");
    }
}
