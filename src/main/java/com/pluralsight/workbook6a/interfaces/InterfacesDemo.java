package com.pluralsight.workbook6a.interfaces;

public class InterfacesDemo {

    public static void main(String[] args) {
        // Workbook 6a p. 14
        RidingMower mower = new RidingMower("Toro", "S3500", "35 in");
        System.out.println(mower.getName());
        mower.turnOn();
        mower.repair();
    }
}
