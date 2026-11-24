package com.pluralsight.workbook6a.greetlambdas.solutions;

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

        // one input, as a lambda
        NameGreeter nameGreeter = name -> "Hello, " + name + "!";
        System.out.println(nameGreeter.greet("Ezra"));

        // two inputs, as a lambda
        FullNameGreeter fullNameGreeter = (firstName, lastName) -> "Hello, " + firstName + " " + lastName + "!";
        System.out.println(fullNameGreeter.greet("Ezra", "Banks"));
    }
}
