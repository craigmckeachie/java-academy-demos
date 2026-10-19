package com.pluralsight.workbook2a.strings;

public class SearchingStringsDemo {

    public static void main(String[] args) {
        // Workbook 2a p. 11: charAt
        String trackingCode = "USA-12981-Y-22";
        char hasShipped = trackingCode.charAt(10);
        System.out.println(hasShipped);              // Y

        // p. 11: indexOf (returns -1 if it doesn't find it)
        String productCode = "ACME-12213";
        // TODO: find the dash, then cut productCode into vendor and productNum
    }
}
