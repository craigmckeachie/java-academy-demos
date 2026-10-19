package com.pluralsight.workbook2a.strings.solutions;

public class SearchingStringsDemo {

    public static void main(String[] args) {
        // Workbook 2a p. 11: charAt
        String trackingCode = "USA-12981-Y-22";
        char hasShipped = trackingCode.charAt(10);
        System.out.println(hasShipped);              // Y

        // p. 11: indexOf (returns -1 if it doesn't find it)
        String productCode = "ACME-12213";
        int dashPosition = productCode.indexOf("-");
        System.out.println(dashPosition);            // 4

        // p. 11: substring (the ending index is NOT included)
        String vendor = productCode.substring(0, dashPosition);
        String productNum = productCode.substring(dashPosition + 1);
        System.out.println(vendor);                  // ACME
        System.out.println(productNum);              // 12213
    }
}
