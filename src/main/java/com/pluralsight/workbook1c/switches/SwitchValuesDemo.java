package com.pluralsight.workbook1c.switches;

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
        System.out.println(description);

        // TODO: p. 124: one case for several values: 0 and 6 are "Weekend", 1 to 5 are "Weekday"
    }
}
