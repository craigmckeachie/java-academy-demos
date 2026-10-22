package com.pluralsight.workbook2a.arrays.solutions;

public class ArrayForLoopDemo {

    public static void main(String[] args) {
        // Workbook 2a p. 69: the while loop from ArrayWhileLoopDemo, as a for
        int[] numbers = {54, 77, 88, 99, 12, 83};

        // int index = 0;                          // initialization
        // while (index < numbers.length) {        // condition
        //     int currentNumber = numbers[index];
        //     System.out.println(currentNumber);
        //     index = index + 1;                  // increment
        // }

        for (int index = 0; index < numbers.length; index = index + 1) {
            int currentNumber = numbers[index];
            System.out.println(currentNumber);
        }
    }
}
