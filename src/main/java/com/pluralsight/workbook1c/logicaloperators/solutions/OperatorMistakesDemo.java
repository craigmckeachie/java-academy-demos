package com.pluralsight.workbook1c.logicaloperators.solutions;

// Review of Workbook 1c pp. 101-102: two mistakes that compile and run, fixed
public class OperatorMistakesDemo {

    public static void main(String[] args) {
        // Mistake 1: = stores a value; a boolean is already a question
        boolean occupied = false;
        if (occupied) {
            System.out.println("The room is occupied.");
        }
        System.out.println("occupied is now " + occupied);

        // Mistake 2: "not Texas AND not Kansas", because every state is not one of the two
        String homeState = "Texas";
        if (!homeState.equals("Texas") && !homeState.equals("Kansas")) {
            System.out.println(homeState + ": call 855-555-5555");
        } else {
            System.out.println(homeState + ": call 800-555-5555");
        }
    }
}
