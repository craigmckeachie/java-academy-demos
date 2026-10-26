package com.pluralsight.workbook3a.dates.solutions;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class CurrentDateDemo {

    public static void main(String[] args) {
        // Workbook 3a p. 26: now() gets the current date and/or time from the computer

        // only a date (good for birthdays)
        LocalDate today = LocalDate.now();
        System.out.println("Today is: " + today);

        // only a time (good for a store's closing time)
        LocalTime currentTime = LocalTime.now();
        System.out.println("The current time is: " + currentTime);

        // both a date and a time (good for a bank deposit)
        LocalDateTime rightNow = LocalDateTime.now();
        System.out.println("Right now, it is: " + rightNow);
    }
}
