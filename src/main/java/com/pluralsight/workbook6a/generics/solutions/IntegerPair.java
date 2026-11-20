package com.pluralsight.workbook6a.generics.solutions;

// Workbook 6a p. 45
public class IntegerPair {
    private int leftNumber;
    private int rightNumber;

    public IntegerPair(int leftNumber, int rightNumber) {
        this.leftNumber = leftNumber;
        this.rightNumber = rightNumber;
    }

    public int getLeftNumber() {
        return leftNumber;
    }

    public int getRightNumber() {
        return rightNumber;
    }

    public void swap() {
        int temp = leftNumber;
        leftNumber = rightNumber;
        rightNumber = temp;
    }
}
