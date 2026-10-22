package com.pluralsight.workbook2a.loops.solutions;

public class WhileLoopDemo {

    public static void main(String[] args) {
        // Workbook 2a p. 60: repeat while the condition is true

        // initialization: the counter starts at 1
        int count = 1;

        // condition: keep going while this is true
        while (count <= 5) {
            System.out.println(count);
            count = count + 1;   // increment: without this, the loop never stops
        }
    }
}
