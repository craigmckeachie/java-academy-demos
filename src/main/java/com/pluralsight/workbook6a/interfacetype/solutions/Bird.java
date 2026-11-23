package com.pluralsight.workbook6a.interfacetype.solutions;

public class Bird implements Flyable {

    @Override
    public void fly() {
        System.out.println("The bird flaps its wings and takes off.");
    }

    public void buildNest() {
        System.out.println("The bird builds a nest.");
    }
}
