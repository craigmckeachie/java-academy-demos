package com.pluralsight.workbook2a.loops;

public class BreakContinueDemo {

    public static void main(String[] args) {
        // Workbook 2a p. 63: break exits the loop early
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                break;
            }
            sum += i;
        }
        System.out.println("Sum = " + sum);

        // p. 63: continue skips the rest of this pass only
        sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                continue;
            }
            sum += i;
        }
        System.out.println("Sum = " + sum);

        // p. 64: the same result, written as what to include instead of what to skip
        sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 3 != 0) {
                sum += i;
            }
        }
        System.out.println("Sum = " + sum);
    }
}
