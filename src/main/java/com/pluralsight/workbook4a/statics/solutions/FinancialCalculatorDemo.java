package com.pluralsight.workbook4a.statics.solutions;

import java.math.BigDecimal;

public class FinancialCalculatorDemo {

    public static void main(String[] args) {
        // Workshop 1w's example: $53,000 at 7.625% for 15 years
        BigDecimal principal = new BigDecimal("53000");
        BigDecimal rate = new BigDecimal("7.625");
        int years = 15;

        BigDecimal payment = FinancialCalculator.calculateMonthlyPayment(principal, rate, years);
        System.out.println("Monthly payment: $" + payment); // $495.09

        BigDecimal interest = FinancialCalculator.calculateTotalInterest(principal, rate, years);
        System.out.println("Total interest: $" + interest); // $36116.20
    }
}
