package com.pluralsight.workbook2a.strings.solutions;

public class CheckingStringsDemo {

    public static void main(String[] args) {
        // Workbook 2a p. 10: startsWith
        String discountCode = "FAIR-15OFF";
        if (discountCode.startsWith("FAIR")) {
            // this is true
            System.out.println(discountCode + " starts with FAIR");
        }

        // p. 10: endsWith
        String discountCode2 = "SAVE-50";
        if (discountCode2.endsWith("-50")) {
            // this is true
            System.out.println(discountCode2 + " ends with -50");
        }
    }
}
