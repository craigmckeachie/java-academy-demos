package com.pluralsight.workbook3a.dates.solutions;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingDatesDemo {

    public static void main(String[] args) {
        // Workbook 3a p. 31: show a date in the format you choose
        LocalDateTime today = LocalDateTime.now();
        System.out.println("Today is: " + today);

        // specify the date/time format you want to use
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E, MMM dd, yyyy HH:mm:ss");
        String formattedDate = today.format(formatter);
        System.out.println("Today is: " + formattedDate);
    }
}
