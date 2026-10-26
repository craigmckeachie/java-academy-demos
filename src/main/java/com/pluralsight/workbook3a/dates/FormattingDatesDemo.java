package com.pluralsight.workbook3a.dates;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingDatesDemo {

    public static void main(String[] args) {
        // Workbook 3a p. 31: show a date in the format you choose
        LocalDateTime today = LocalDateTime.now();
        System.out.println("Today is: " + today);

        // TODO: make a DateTimeFormatter with the pattern "E, MMM dd, yyyy HH:mm:ss"

        // TODO: format today with it and print "Today is: " plus the formatted date
    }
}
