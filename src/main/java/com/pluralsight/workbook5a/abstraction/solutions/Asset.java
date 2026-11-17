package com.pluralsight.workbook5a.abstraction.solutions;

import java.math.BigDecimal;

// abstract: you can't make an Asset, only a House, Jewelry, ...
public abstract class Asset {
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

    // abstract: no body, and every child class MUST override it
    public abstract BigDecimal getValue();
}
