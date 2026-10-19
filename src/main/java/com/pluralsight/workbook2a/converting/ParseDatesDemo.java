package com.pluralsight.workbook2a.converting;

public class ParseDatesDemo {

    public static void main(String[] args) {
        // activity|miles|minutes|date
        String logEntry = "Run|3.5|32|2026-10-19";

        // Slice A: split the entry and turn the pieces into numbers
        String[] parts = logEntry.split("\\|");

        String activity = parts[0];
        double miles = Double.parseDouble(parts[1]);
        int minutes = Integer.parseInt(parts[2]);

        double pace = minutes / miles;
        System.out.printf("%s: %.1f miles in %d minutes (%.2f min/mile)%n", activity, miles, minutes, pace);

        // Slice B: turn text into dates
        String nextRaceText = "Oct 26, 2026";
    }
}
