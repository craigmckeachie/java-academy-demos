package com.pluralsight.workbook2a.strings;

public class ComparingStringsDemo {

    public static void main(String[] args) {
        // Workbook 2a p. 7
        // The compiler creates a string literal "ABC" and
        // the s1 variable references it
        String s1 = "ABC";
        // s2 references the **same string literal**
        String s2 = "ABC";
        String prefix = "A";
        String s3 = prefix + "BC";

        if (s1 == s2) {
            System.out.println("s1 == s2");
        }
        if (s1 == s3) {
            System.out.println("s1 == s3");
        }

        // Workbook 2a p. 8: equals() compares the characters
        // TODO: compare s1 and s3 with equals()

        // Workbook 2a p. 8: equalsIgnoreCase() doesn't care about capitals
        String lower = "abc";
        if (s1.equalsIgnoreCase(lower)) {
            System.out.println("s1.equalsIgnoreCase(lower)");
        }
    }
}
