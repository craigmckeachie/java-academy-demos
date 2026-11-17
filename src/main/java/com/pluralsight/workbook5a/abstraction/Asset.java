package com.pluralsight.workbook5a.abstraction;

import java.math.BigDecimal;

public class Asset {
    protected String description;
    protected int yearAcquired;
    protected BigDecimal originalCost;

    public Asset(String description, int yearAcquired, BigDecimal originalCost) {
        this.description = description;
        this.yearAcquired = yearAcquired;
        this.originalCost = originalCost;
    }

    public String getDescription() {
        return description;
    }

    public int getYearAcquired() {
        return yearAcquired;
    }

    public BigDecimal getValue() {
        return originalCost;
    }
}
