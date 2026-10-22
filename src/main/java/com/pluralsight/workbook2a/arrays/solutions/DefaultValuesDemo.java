package com.pluralsight.workbook2a.arrays.solutions;

public class DefaultValuesDemo {

    public static void main(String[] args) {
        // Workbook 2a p. 70: a fixed size with no values gets default values
        int[] numbers = new int[5];
        for (int currentNumber : numbers) {
            System.out.println(currentNumber);       // 0 (five times)
        }

        String[] words = new String[5];
        for (String currentWord : words) {
            System.out.println(currentWord);         // null (five times)
        }
    }
}
