package com.pluralsight.workbook1c.formatting.solutions;

public class StringFormatDemo {
    public static void main(String[] args) {
        int id = 10135;
        String name = "Brandon Plyers";
        double pay = 5239.7;

        // BEFORE: String concatenation
        // Goal: "Brandon Plyers id:10135 $5239.70"
        String messageUsingConcat = name + " id:" + id + " $" + pay;
        System.out.println(messageUsingConcat);

        // AFTER: String.format -- a template with placeholders, values filled in order
        String messageUsingStringFormat = String.format("%s id:%d $%.2f", name, id, pay);
        System.out.println(messageUsingStringFormat);

        // SHORTCUT: printf -- format AND print in one step (like print, so add %n)
        System.out.printf("%s id:%d $%.2f%n", name, id, pay);
    }
}
