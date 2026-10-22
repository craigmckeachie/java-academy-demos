package com.pluralsight.workbook2a.arrays;

public class PassingArrayDemo {

    public static void main(String[] args) {
        // Workbook 2a p. 73 (the workbook names this class Program)
        int[] numbers = {54, 77, 88, 99, 12, 83};
        // TODO: pass numbers to displayNumbers
    }

    // no size in the parameter: any int array can be passed in
    public static void displayNumbers(int[] numbers) {
        for (int currentNumber : numbers) {
            System.out.println(currentNumber);
        }
    }
}
