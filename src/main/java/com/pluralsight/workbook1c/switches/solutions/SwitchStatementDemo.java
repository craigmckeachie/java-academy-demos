package com.pluralsight.workbook1c.switches.solutions;

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

        // p. 122: the same check as a switch; only the matching case block runs
        switch (dayNumber) {
            case 0 -> {
                System.out.println("Sunday");
            }
            case 1 -> {
                System.out.println("Monday");
            }
            case 2 -> {
                System.out.println("Tuesday");
            }
            case 3 -> {
                System.out.println("Wednesday");
            }
            default -> {
                System.out.println("Invalid day");
            }
        }
    }
}
