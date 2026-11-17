package com.pluralsight.workbook5a.abstraction.solutions;

import java.math.BigDecimal;

public class House extends Asset {
    private String address;
    private int squareFeet;
    private int lotSize;

    public House(String description, String address, int squareFeet, int lotSize,
                 int yearAcquired, BigDecimal originalCost) {
        super(description, yearAcquired, originalCost);
        this.address = address;
        this.squareFeet = squareFeet;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public int getSquareFeet() {
        return squareFeet;
    }

    public int getLotSize() {
        return lotSize;
    }

    @Override
    public BigDecimal getValue() {
        return BigDecimal.valueOf(180)
                .multiply(BigDecimal.valueOf(squareFeet))
                .add(new BigDecimal("0.25")
                        .multiply(BigDecimal.valueOf(lotSize)));
    }
}
