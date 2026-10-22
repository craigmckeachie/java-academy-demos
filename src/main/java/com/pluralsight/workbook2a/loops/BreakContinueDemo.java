package com.pluralsight.workbook2a.loops;

public class BreakContinueDemo {

    public static void main(String[] args) {
        // Workbook 2a p. 63: break leaves the loop early
        for (int count = 1; count <= 5; count = count + 1) {
            if (count == 3) {
                break;
            }
            System.out.println(count);
        }

        System.out.println("---");

        // p. 63: continue skips the rest of this pass only
        for (int count = 1; count <= 5; count = count + 1) {
            if (count == 3) {
                continue;
            }
            System.out.println(count);
        }

        System.out.println("---");

        // p. 64: the same result, written as what to include instead of what to skip
        for (int count = 1; count <= 5; count = count + 1) {
            if (count != 3) {
                System.out.println(count);
            }
        }
    }
}
