package com.pluralsight.workbook5a.abstraction.solutions;

import java.math.BigDecimal;

public class AbstractClassDemo {

    public static void main(String[] args) {
        // Workbook 5a p. 50
        // new Asset(...) won't compile now: Asset is abstract. "What type of asset?"

        // Workbook 5a p. 52
        House myHouse = new House("Ranch House", "402 Stevens", 2000, 43560,
                2020, new BigDecimal("220000"));
        System.out.println(myHouse.getDescription() + ": $" + myHouse.getValue());
    }
}
