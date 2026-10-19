package com.pluralsight.workbook1c.formatting.solutions;

public class DecimalFormattingDemo {
    public static void main(String[] args) {
        double subtotal = 22.87;
        double tax = subtotal * 0.0825;
        double totalDue = subtotal + tax;

        // BEFORE
        System.out.println("Total due is: $" + totalDue);

        // AFTER
        System.out.println("Total due is: $" + String.format("%.2f", totalDue));
        System.out.printf("Total due is: $%.2f%n", totalDue);
    }
}
