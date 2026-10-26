package com.pluralsight.workbook3a.arraylists.solutions;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        // Workbook 3a pp. 41-42: an ArrayList grows as you add to it
        ArrayList<String> kids = new ArrayList<>();
        System.out.println(kids.size());             // 0

        kids.add("Natalie");
        kids.add("Brittany");
        kids.add("Zachary");

        System.out.println(kids);                    // [Natalie, Brittany, Zachary]
        System.out.println(kids.size());             // 3

        // p. 43: get one item by its index (the first index is 0)
        System.out.println(kids.get(1));             // Brittany

        // p. 43: loop with an index, from 0 up to size()
        for (int index = 0; index < kids.size(); index = index + 1) {
            System.out.println((index + 1) + " : " + kids.get(index));
        }

        // the same for-each loop you used with arrays
        for (String kid : kids) {
            System.out.println(kid);
        }
    }
}
