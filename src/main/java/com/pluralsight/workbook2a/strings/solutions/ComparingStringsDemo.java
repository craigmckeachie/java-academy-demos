package com.pluralsight.workbook2a.strings.solutions;

public class ComparingStringsDemo {

    public static void main(String[] args) {
        // Workbook 2a p. 7
        // The compiler creates a string literal "ABC" and
        // the s1 variable references it
        String s1 = "ABC";
        // s2 references the **same string literal**
        String s2 = "ABC";
        // But s3 does NOT reference that literal because its
        // value was created by performing concatenations
        String prefix = "A";
        String s3 = prefix + "BC";

        if (s1 == s2) {
            // this will be true
            System.out.println("s1 == s2");
        }
        if (s1 == s3) {
            // this will be false even though they both
            // would display the string "ABC"
            System.out.println("s1 == s3");
        }

        // Workbook 2a p. 8: equals() compares the characters
        if (s1.equals(s3)) {
            // this will be true
            System.out.println("s1.equals(s3)");
        }

        // Workbook 2a p. 8: equalsIgnoreCase() doesn't care about capitals
        String lower = "abc";
        if (s1.equalsIgnoreCase(lower)) {
            // this will be true
            System.out.println("s1.equalsIgnoreCase(lower)");
        }
    }
}
