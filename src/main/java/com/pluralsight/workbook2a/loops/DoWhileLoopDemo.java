package com.pluralsight.workbook2a.loops;

public class DoWhileLoopDemo {

    public static void main(String[] args) {
        // Workbook 2a p. 61: the body always runs at least once,
        // then repeats while the condition is true
        int i = 1;
        int sum = 0;

        do {
            sum += i;
            i++;
        } while (i <= 10);

        System.out.println("Sum = " + sum);
    }
}
