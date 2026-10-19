package com.pluralsight.workbook2a.strings;

public class ComparingStringsDemo {

    public static void main(String[] args) {
        // The compiler creates a string literal "ABC" and
        // the s1 variable references it
        String s1 = "ABC";
        // s2 references the **same string literal**
        String s2 = "ABC";
        // But s3 does NOT reference that literal because its
        // value was created by performing concatenations
        String prefix = "A";
        String s3 = prefix + "BC";

        // TODO: compare s1 and s2 with ==

        // TODO: compare s1 and s3 with ==

        // TODO: compare s1 and s3 with equals()

        // TODO: compare s1 with "abc" using equalsIgnoreCase()
    }
}
