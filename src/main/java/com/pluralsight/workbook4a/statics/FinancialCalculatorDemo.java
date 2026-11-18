package com.pluralsight.workbook4a.statics;

import java.math.BigDecimal;

public class FinancialCalculatorDemo {

    public static void main(String[] args) {
        // Workshop 1w's example: $53,000 at 7.625% for 15 years
        BigDecimal principal = new BigDecimal("53000");
        BigDecimal rate = new BigDecimal("7.625");
        int years = 15;

        BigDecimal payment = FinancialCalculator.calculateMonthlyPayment(principal, rate, years);
        System.out.println("Monthly payment: $" + payment);

        // TODO: print the total interest
    }
}
