package com.pluralsight.workbook2a.strings;

import java.util.regex.Pattern;

public class SplitDemo {

    public static void main(String[] args) {
        // Workbook 2a p. 12
        String input = "Dallas|Ft. Worth|Austin";
        String[] cities = input.split("\\|");
        // cities is an array containing 3 strings
        // [0] is Dallas, [1] is Ft. Worth, [2] is Austin
        System.out.println(cities[0]);
        System.out.println(cities[1]);
        System.out.println(cities[2]);

        // Alternatively: Pattern.quote() returns a regular expression for the literal pipe
        String[] cities2 = input.split(Pattern.quote("|"));
        System.out.println(cities2[1]);
    }
}
