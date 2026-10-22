package com.pluralsight.workbook2a.arrays.solutions;

public class PassingArrayDemo {

    public static void main(String[] args) {
        // Workbook 2a p. 73 (the workbook names this class Program)
        int[] numbers = {54, 77, 88, 99, 12, 83};
        displayNumbers(numbers);
    }

    // no size in the parameter: any int array can be passed in
    public static void displayNumbers(int[] numbers) {
        for (int currentNumber : numbers) {
            System.out.println(currentNumber);
        }
    }
}
