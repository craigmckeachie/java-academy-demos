package com.pluralsight.workbook1c.formatting;

public class DecimalFormattingDemo {
    public static void main(String[] args) {
        double subtotal = 22.87;
        double tax = subtotal * 0.0825;
        double totalDue = subtotal + tax;

        // BEFORE
        System.out.println("Total due is: $" + totalDue);

        // TODO: AFTER -- show totalDue with 2 decimal places (String.format, then printf)
    }
}
