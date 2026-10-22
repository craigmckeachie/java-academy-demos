package com.pluralsight.workbook2a.arrays.solutions;

public class ForEachDemo {

    public static void main(String[] args) {
        // Workbook 2a p. 71: for-each hands you each element, one at a time
        int[] numbers = {54, 77, 88, 99, 12, 83};

        for (int currentNumber : numbers) {
            System.out.println(currentNumber);
        }

        // for (type elementName : arrayName) {
        //     // code
        // }
        //
        // int           the data type of ONE element in the array
        // currentNumber the name for one element: you pick it, and it should be singular
        // :             read it as "in"
        // numbers       the array (plural)
    }
}
