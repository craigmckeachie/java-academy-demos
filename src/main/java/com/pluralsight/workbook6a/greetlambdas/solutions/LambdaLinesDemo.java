package com.pluralsight.workbook6a.greetlambdas.solutions;

public class LambdaLinesDemo {

    public static void main(String[] args) {
        // one line: no { } and no return
        NameGreeter oneLine = name -> "Hello, " + name + "!";
        System.out.println(oneLine.greet("Ezra"));

        // two lines that give back an answer: { } and return
        NameGreeter twoLines = name -> {
            String upperName = name.toUpperCase();
            return "Hello, " + upperName + "!";
        };
        System.out.println(twoLines.greet("Ezra"));

        // two lines that give nothing back (void): { } but no return
        NamePrinter printer = name -> {
            System.out.println("Hello, " + name + "!");
            System.out.println("Goodbye, " + name + "!");
        };
        printer.print("Ezra");
    }
}
