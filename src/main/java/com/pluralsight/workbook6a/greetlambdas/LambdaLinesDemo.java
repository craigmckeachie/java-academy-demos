package com.pluralsight.workbook6a.greetlambdas;

public class LambdaLinesDemo {

    public static void main(String[] args) {
        // one line: no { } and no return
        NameGreeter oneLine = name -> "Hello, " + name + "!";
        System.out.println(oneLine.greet("Ezra"));

        // TODO: two lines that give back an answer

        // TODO: two lines that give nothing back
    }
}
