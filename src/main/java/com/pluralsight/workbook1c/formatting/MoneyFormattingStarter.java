package com.pluralsight.workbook1c.formatting;

public class MoneyFormattingStarter {
    public static void main(String[] args) {
        double subtotal = 22.87;
        double tax = subtotal * 0.0825;
        double totalDue = subtotal + tax;

        // BEFORE
        System.out.println("Total due is: $" + totalDue);

        // TODO: AFTER -- show totalDue with 2 decimal places (String.format, then printf)

        // float (what the workbook uses) -- needs the f suffix, and is less precise
        float subtotalF = 22.87f;
        float taxF = subtotalF * 0.0825f;
        float totalDueF = subtotalF + taxF;

        System.out.println("float total: " + totalDueF);
    }
}
