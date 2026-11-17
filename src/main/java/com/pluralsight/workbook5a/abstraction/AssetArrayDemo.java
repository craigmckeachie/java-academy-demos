package com.pluralsight.workbook5a.abstraction;

import java.math.BigDecimal;

public class AssetArrayDemo {

    public static void main(String[] args) {
        // Workbook 5a p. 52
        Asset[] myAssets = new Asset[3];

        myAssets[0] = new House("Ranch House", "4 Steve st", 2000, 43560,
                2020, new BigDecimal("220000"));
        myAssets[1] = new House("Rental", "3329 Duchess", 22600, 5445,
                1995, new BigDecimal("53000"));
        myAssets[2] = new Jewelry("Ring", "Diamond", 1.5, 1979, new BigDecimal("1200"));

        BigDecimal myNetWorth = BigDecimal.ZERO;

        for (Asset asset : myAssets) {
            // TODO: add this asset's value to myNetWorth
        }

        System.out.printf("My Current Net Worth: $%.2f%n", myNetWorth);
    }
}
