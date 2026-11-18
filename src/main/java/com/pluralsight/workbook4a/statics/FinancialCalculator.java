package com.pluralsight.workbook4a.statics;

import java.math.BigDecimal;
import java.math.RoundingMode;

// The Week 1 mortgage calculator (Workshop 1w, Calculator 1), as a utility class
public class FinancialCalculator {

    // TODO: a private constructor, so nobody can write new FinancialCalculator()

    // Returns the monthly payment on a loan, rounded to cents
    public static BigDecimal calculateMonthlyPayment(BigDecimal principal, BigDecimal yearlyRatePercent, int years) {
        int months = years * 12;
        BigDecimal monthlyRate = yearlyRatePercent.divide(new BigDecimal("1200"), 20, RoundingMode.HALF_UP);
        BigDecimal growth = BigDecimal.ONE.add(monthlyRate).pow(months);

        return principal.multiply(monthlyRate)
                .multiply(growth)
                .divide(growth.subtract(BigDecimal.ONE), 2, RoundingMode.HALF_UP);
    }

    // TODO: calculateTotalInterest(principal, yearlyRatePercent, years)
}
