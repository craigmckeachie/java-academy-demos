package com.pluralsight.workbook4a.bigdecimal.solutions;

import java.math.BigDecimal;

public class ExactDecimalsDemo {

    public static void main(String[] args) {
        // Workbook 4a p. 69
        double doubleTotal = 0.1 + 0.2;
        System.out.println(doubleTotal); // 0.30000000000000004

        BigDecimal first = new BigDecimal("0.1");
        BigDecimal second = new BigDecimal("0.2");
        BigDecimal exactTotal = first.add(second);
        System.out.println(exactTotal); // 0.3
    }
}
