package com.pluralsight.workbook1c.conditionals.solutions;

public class LogicalOperatorsDemo {

    public static void main(String[] args) {
        int temperature = 75;      // degrees Fahrenheit
        boolean isRaining = true;
        String day = "Saturday";

        // Question 1: Is it raining?
        if (isRaining) {
            System.out.println("Bring an umbrella!");
        }

        // Question 2: How warm is it? (the first "yes" wins)
        if (temperature >= 85) {
            System.out.println("Wear shorts and a t-shirt.");
        } else if (temperature >= 65) {
            System.out.println("A t-shirt is fine.");
        } else if (temperature >= 45) {
            System.out.println("Grab a jacket.");
        } else {
            System.out.println("Bundle up in a winter coat!");
        }

        // Question 3: Is it the weekend AND not raining?
        boolean isWeekend = day.equals("Saturday") || day.equals("Sunday");
        if (isWeekend && !isRaining) {
            System.out.println("Great day for the park!");
        } else {
            System.out.println("Maybe a movie instead.");
        }
    }
}
