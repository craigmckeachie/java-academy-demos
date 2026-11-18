package com.pluralsight.workbook4a.statics.solutions;

import java.math.BigDecimal;
import java.math.RoundingMode;

// The Week 1 mortgage calculator (Workshop 1w, Calculator 1), as a utility class
public class FinancialCalculator {

    private FinancialCalculator() {
    }

    // Returns the monthly payment on a loan, rounded to cents
    public static BigDecimal calculateMonthlyPayment(BigDecimal principal, BigDecimal yearlyRatePercent, int years) {
        int months = years * 12;
        BigDecimal monthlyRate = yearlyRatePercent.divide(new BigDecimal("1200"), 20, RoundingMode.HALF_UP);
        BigDecimal growth = BigDecimal.ONE.add(monthlyRate).pow(months);

        return principal.multiply(monthlyRate)
                .multiply(growth)
                .divide(growth.subtract(BigDecimal.ONE), 2, RoundingMode.HALF_UP);
    }

    // Returns everything paid over the life of the loan, minus what was borrowed
    public static BigDecimal calculateTotalInterest(BigDecimal principal, BigDecimal yearlyRatePercent, int years) {
        BigDecimal monthlyPayment = calculateMonthlyPayment(principal, yearlyRatePercent, years);
        BigDecimal totalPaid = monthlyPayment.multiply(new BigDecimal(years * 12));
        return totalPaid.subtract(principal);
    }
}
