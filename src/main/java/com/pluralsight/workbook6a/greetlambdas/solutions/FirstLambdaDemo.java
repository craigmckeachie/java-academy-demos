package com.pluralsight.workbook6a.greetlambdas.solutions;

public class FirstLambdaDemo {

    // a normal method
    public static String greet() {
        return "Hello, world!";
    }

    public static void main(String[] args) {
        System.out.println(greet());

        // the same greeting, as a lambda
        Greeter greeter = () -> "Hello, world!";
        System.out.println(greeter.greet());
    }
}
