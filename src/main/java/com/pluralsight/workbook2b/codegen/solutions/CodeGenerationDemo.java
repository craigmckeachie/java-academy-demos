package com.pluralsight.workbook2b.codegen.solutions;

public class CodeGenerationDemo {

    public static void main(String[] args) {
        // Workbook 2b p. 16 (the workbook uses its HelloWorld class)
        System.out.println("Hello World!");

        Customer me = new Customer(1, "Dana W.", 125.00);

        System.out.println(me.toString());
        System.out.println(me);            //toString() not really needed
    }
}
