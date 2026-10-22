package com.pluralsight.workbook2a.arrays.solutions;

public class ReturningArrayDemo {

    public static void main(String[] args) {
        // Workbook 2a p. 74 (the workbook names this class Program)
        int[] numbers = getNumbers();
        for (int currentNumber : numbers) {
            System.out.println(currentNumber);
        }
    }

    // no size in the return type either
    public static int[] getNumbers() {
        int[] numbers = {54, 77, 88, 99, 12, 83};
        return numbers;
    }
}
