package com.pluralsight.workbook2a.arrays;

public class ArrayForLoopDemo {

    public static void main(String[] args) {
        // Workbook 2a p. 69: the while loop from ArrayWhileLoopDemo, as a for
        int[] numbers = {54, 77, 88, 99, 12, 83};

        int index = 0;                          // initialization
        while (index < numbers.length) {        // condition
            int currentNumber = numbers[index];
            System.out.println(currentNumber);
            index = index + 1;                  // increment
        }

        // TODO: comment out the while loop, then write the same loop as a for
    }
}
