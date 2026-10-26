package com.pluralsight.workbook1c.switches.solutions;

public class SwitchValuesDemo {

    public static void main(String[] args) {
        int dayNumber = 6;

        // Workbook 1c p. 123: a switch can produce a value; note the ; after the closing }
        String description = switch (dayNumber) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid day";
        };
        System.out.println(description);             // Saturday

        // p. 124: several values can share one case, separated by commas
        String dayType = switch (dayNumber) {
            case 0, 6 -> "Weekend";
            case 1, 2, 3, 4, 5 -> "Weekday";
            default -> "Invalid day";
        };
        System.out.println(dayType);                 // Weekend
    }
}
