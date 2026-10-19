package com.pluralsight.workbook2a.arrays.solutions;

import java.util.Arrays;

public class SortingArrayDemo {

    public static void main(String[] args) {
        // Workbook 2a p. 75 (the workbook names this class Program)
        String[] nameList = {
            "Natalie", "Brittany", "Zachary", "Ezra", "Ian",
            "Siddalee", "Elisha", "Pursalane", "Zephaniah", "Alice"
        };
        Arrays.sort(nameList);
        for (String name : nameList) {
            System.out.println(name);                // Alice, Brittany, Elisha, Ezra, ...
        }
    }
}
