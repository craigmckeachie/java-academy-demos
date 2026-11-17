package com.pluralsight.workbook5a.abstraction.solutions;

import java.math.BigDecimal;

public class Jewelry extends Asset {
    private String stone;
    private double carats;

    public Jewelry(String description, String stone, double carats,
                   int yearAcquired, BigDecimal originalCost) {
        super(description, yearAcquired, originalCost);
        this.stone = stone;
        this.carats = carats;
    }

    public String getStone() {
        return stone;
    }

    public double getCarats() {
        return carats;
    }

    @Override
    public BigDecimal getValue() {
        return BigDecimal.valueOf(4000)
                .multiply(BigDecimal.valueOf(carats));
    }
}
