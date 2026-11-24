package com.pluralsight.workbook6a.greetlambdas;

public class LambdaInputsDemo {

    // one input
    public static String greet(String name) {
        return "Hello, " + name + "!";
    }

    // two inputs
    public static String greet(String firstName, String lastName) {
        return "Hello, " + firstName + " " + lastName + "!";
    }

    public static void main(String[] args) {
        System.out.println(greet("Ezra"));
        System.out.println(greet("Ezra", "Banks"));

        // TODO: one input, as a lambda

        // TODO: two inputs, as a lambda
    }
}
