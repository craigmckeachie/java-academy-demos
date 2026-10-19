package com.pluralsight.workbook2a.converting.solutions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ParseDatesDemo {

    public static void main(String[] args) {
        // Workbook 2a p. 18: the standard format needs no pattern
        String userInput = "2002-10-17";
        LocalDate birthDay = LocalDate.parse(userInput);
        System.out.println(birthDay);                // 2002-10-17

        // p. 18: any other format needs a pattern
        DateTimeFormatter formatter;
        userInput = "10/17/2022";
        formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        birthDay = LocalDate.parse(userInput, formatter);
        System.out.println(birthDay);                // 2022-10-17

        // p. 19: the pattern codes are in the table on that page
        userInput = "7 Oct 2002";
        formatter = DateTimeFormatter.ofPattern("d MMM yyyy");
        birthDay = LocalDate.parse(userInput, formatter);
        System.out.println(birthDay);                // 2002-10-07
    }
}
