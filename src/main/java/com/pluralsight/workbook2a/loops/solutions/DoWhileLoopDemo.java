package com.pluralsight.workbook2a.loops.solutions;

public class DoWhileLoopDemo {

    public static void main(String[] args) {
        // Workbook 2a p. 61: the body runs first, then the condition is checked,
        // so a do/while always runs at least once
        int count = 1;

        do {
            System.out.println(count);
            count = count + 1;
        } while (count <= 5);
    }
}
