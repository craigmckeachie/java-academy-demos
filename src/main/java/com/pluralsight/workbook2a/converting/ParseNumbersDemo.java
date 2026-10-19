package com.pluralsight.workbook2a.converting;

import java.util.regex.Pattern;

public class ParseNumbersDemo {

    public static void main(String[] args) {
        // Workbook 2a p. 17
        // string contains "id|description|quantity|price"
        String input = "111|Hot Chocolate (12-count)|21|4.99";
        String[] tokens = input.split(Pattern.quote("|"));
        int id = Integer.parseInt(tokens[0]);
        String description = tokens[1];
        // TODO: convert tokens[2] to an int and tokens[3] to a double

        System.out.println("id: " + id);
        System.out.println("description: " + description);
        // TODO: print quantity and price
    }
}
