package com.pluralsight.workbook1c.formatting;

public class StringFormatDemo {
    public static void main(String[] args) {
        int id = 10135;
        String name = "Brandon Plyers";
        double pay = 5239.7;

        // BEFORE: String concatenation
        // Goal: "Brandon Plyers id:10135 $5239.70"
        String messageUsingConcat = name + " id:" + id + " $" + pay;
        System.out.println(messageUsingConcat);

        // TODO: AFTER -- build the same message with String.format

        // TODO: SHORTCUT -- format and print in one step with printf
    }
}
