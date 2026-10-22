package com.pluralsight.workbook2a.arrays.solutions;

public class ArrayWhileLoopDemo {

    public static void main(String[] args) {
        int[] numbers = {54, 77, 88, 99, 12, 83};

        // initialization: arrays start at index 0
        int index = 0;

        // condition: stop before index reaches the length (the last index is length - 1)
        while (index < numbers.length) {
            int currentNumber = numbers[index];
            System.out.println(currentNumber);
            index = index + 1;   // increment
        }
    }
}
