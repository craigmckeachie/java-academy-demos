package com.pluralsight.workbook2a.loops.solutions;

public class ForLoopDemo {

    public static void main(String[] args) {
        // Workbook 2a p. 62: a for loop is a while loop with the three parts on one line

        // the while loop from WhileLoopDemo:
        // int count = 1;                  // initialization
        // while (count <= 5) {            // condition
        //     System.out.println(count);
        //     count = count + 1;          // increment
        // }

        // the same loop as a for:  for (initialization; condition; increment)
        for (int count = 1; count <= 5; count = count + 1) {
            System.out.println(count);
        }
    }
}
