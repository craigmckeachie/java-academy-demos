package com.pluralsight.workbook1c.logicaloperators;

// Review of Workbook 1c pp. 101-102: && (and), || (or), ! (not)
public class AndOrNotDemo {

    public static void main(String[] args) {
        // 1. Workbook p. 101: who gets the lower price?
        int age = 70;
        // TODO: true when age is under 18, or 65 and over
        boolean lowerPrice = false;
        System.out.println("Lower price: " + lowerPrice);

        // 2. A hotel room, like Room.isAvailable()
        boolean occupied = false;
        boolean dirty = true;
        // TODO: true when the room is not occupied and not dirty
        boolean available = false;
        System.out.println("Available: " + available);

        // 3. A year range, like the Car Dealership search
        int year = 2012;
        int min = 2000;
        int max = 2015;
        // TODO: true when year is from min to max
        boolean inRange = false;
        System.out.println("In range: " + inRange);
    }
}
