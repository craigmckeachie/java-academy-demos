package com.pluralsight.workbook1c.logicaloperators;

// Review of Workbook 1c pp. 101-102: two mistakes that compile and run
public class OperatorMistakesDemo {

    public static void main(String[] args) {
        // Mistake 1
        boolean occupied = false;
        if (occupied = true) {
            System.out.println("The room is occupied.");
        }
        System.out.println("occupied is now " + occupied);

        // Mistake 2: Workbook p. 102's homeState, turned around
        String homeState = "Texas";
        if (!homeState.equals("Texas") || !homeState.equals("Kansas")) {
            System.out.println(homeState + ": call 855-555-5555");
        } else {
            System.out.println(homeState + ": call 800-555-5555");
        }
    }
}
