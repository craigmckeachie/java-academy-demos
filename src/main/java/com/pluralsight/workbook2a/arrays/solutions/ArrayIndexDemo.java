package com.pluralsight.workbook2a.arrays.solutions;

public class ArrayIndexDemo {

    public static void main(String[] args) {
        // Workbook 2a p. 69: an array is a numbered list; the numbers (indexes) start at 0
        int[] numbers = {54, 77, 88, 99, 12, 83};

        int numberA = numbers[4];
        System.out.println(numberA);                 // 12

        int numberB = numbers[2];
        System.out.println(numberB);                 // 88

        System.out.println(numbers[5]);              // 83

        // p. 69: .length is how many elements there are
        System.out.println(numbers.length);          // 6
    }
}
