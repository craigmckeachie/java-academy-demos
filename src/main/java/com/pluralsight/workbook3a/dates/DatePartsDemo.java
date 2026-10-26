package com.pluralsight.workbook3a.dates;

import java.time.LocalDate;
import java.time.LocalTime;

public class DatePartsDemo {

    public static void main(String[] args) {
        // Workbook 3a p. 28: ask a LocalDate for its parts
        LocalDate date = LocalDate.now();
        System.out.println("Day of Week: " + date.getDayOfWeek());
        System.out.println("Day of Month: " + date.getDayOfMonth());
        System.out.println("Day of Year: " + date.getDayOfYear());
        System.out.println("Month Name: " + date.getMonth());

        // TODO: print the month as a number (getMonthValue) and the year (getYear)

        // Workbook 3a p. 29: a LocalTime has parts too
        LocalTime time = LocalTime.now();
        System.out.println("Hour: " + time.getHour());
        System.out.println("Minute: " + time.getMinute());
        System.out.println("Second: " + time.getSecond());
    }
}
