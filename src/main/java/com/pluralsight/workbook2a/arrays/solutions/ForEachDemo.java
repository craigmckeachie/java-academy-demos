package com.pluralsight.workbook2a.arrays.solutions;

public class ForEachDemo {

    public static void main(String[] args) {
        // Workbook 2a p. 71: for-each gives you each element (but not its index)
        String[] schools = {"Calliet", "Cary", "Skyline", "SFASU", "TAMU"};
        for (String school : schools) {
            System.out.println(school);
        }
    }
}
