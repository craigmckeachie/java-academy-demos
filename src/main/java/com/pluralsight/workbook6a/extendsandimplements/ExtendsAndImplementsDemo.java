package com.pluralsight.workbook6a.extendsandimplements;

public class ExtendsAndImplementsDemo {

    public static void main(String[] args) {
        // Workbook 6a p. 18
        RidingMower mower = new RidingMower("Toro", "S3500", "35 in");
        System.out.println(mower.getName());
        mower.turnOn();
        mower.repair();
    }
}
