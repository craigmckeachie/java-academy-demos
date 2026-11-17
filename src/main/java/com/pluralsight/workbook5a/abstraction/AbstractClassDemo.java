package com.pluralsight.workbook5a.abstraction;

import java.math.BigDecimal;

public class AbstractClassDemo {

    public static void main(String[] args) {
        // Workbook 5a p. 50
        Asset thingy = new Asset("Thingy", 2020, new BigDecimal("125.00"));
        System.out.println(thingy.getDescription() + ": $" + thingy.getValue());

        // Workbook 5a p. 52
        House myHouse = new House("Ranch House", "402 Stevens", 2000, 43560,
                2020, new BigDecimal("220000"));
        System.out.println(myHouse.getDescription() + ": $" + myHouse.getValue());
    }
}
