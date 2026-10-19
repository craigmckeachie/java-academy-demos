package com.pluralsight.workbook2a.loops.solutions;

public class WhileLoopDemo {

    public static void main(String[] args) {
        // Workbook 2a p. 60: repeat while the condition is true
        int i = 1;
        int sum = 0;

        while (i <= 10) {
            sum += i;
            i++;
        }

        System.out.println("Sum = " + sum);          // Sum = 55
    }
}
