package com.pluralsight.workbook1c.switches;

public class SwitchStatementDemo {

    public static void main(String[] args) {
        // Workbook 1c p. 123: the if/else-if way to check many values of one variable
        int dayNumber = 3;

        if (dayNumber == 0) {
            System.out.println("Sunday");
        } else if (dayNumber == 1) {
            System.out.println("Monday");
        } else if (dayNumber == 2) {
            System.out.println("Tuesday");
        } else if (dayNumber == 3) {
            System.out.println("Wednesday");
        } else {
            System.out.println("Invalid day");
        }

        // TODO: p. 122: the same check as a switch, with a case block for 0, 1, 2 and 3, and a default
    }
}
