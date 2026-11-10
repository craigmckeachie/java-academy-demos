package com.pluralsight.workbook1c.logicaloperators.solutions;

// Review of Workbook 1c pp. 101-102: && (and), || (or), ! (not)
public class AndOrNotDemo {

    public static void main(String[] args) {
        // 1. Workbook p. 101: who gets the lower price?
        int age = 70;
        boolean lowerPrice = age < 18 || age >= 65;
        System.out.println("Lower price: " + lowerPrice);

        // 2. A hotel room, like Room.isAvailable()
        boolean occupied = false;
        boolean dirty = true;
        boolean available = !occupied && !dirty;
        System.out.println("Available: " + available);

        // 3. A year range, like the Car Dealership search
        int year = 2012;
        int min = 2000;
        int max = 2015;
        boolean inRange = year >= min && year <= max;
        System.out.println("In range: " + inRange);
    }
}
