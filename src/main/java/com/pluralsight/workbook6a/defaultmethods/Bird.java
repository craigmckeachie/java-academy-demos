package com.pluralsight.workbook6a.defaultmethods;

public class Bird implements Flyable {

    @Override
    public void fly() {
        System.out.println("The bird flaps its wings and takes off.");
    }
}
