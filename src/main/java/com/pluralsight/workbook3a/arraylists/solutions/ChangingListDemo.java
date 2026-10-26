package com.pluralsight.workbook3a.arraylists.solutions;

import java.util.ArrayList;

public class ChangingListDemo {

    public static void main(String[] args) {
        // Workbook 3a pp. 44-45: change and remove items by index
        ArrayList<String> kids = new ArrayList<>();
        kids.add("Natalie");
        kids.add("Brittany");
        kids.add("Zachary");
        System.out.println(kids);                    // [Natalie, Brittany, Zachary]

        // p. 44: set replaces the item at an index
        kids.set(2, "Zach");
        System.out.println(kids);                    // [Natalie, Brittany, Zach]

        // p. 45: remove takes it out; everything after it moves down one index
        kids.remove(1);
        System.out.println(kids);                    // [Natalie, Zach]
        System.out.println(kids.get(1));             // Zach
        System.out.println(kids.size());             // 2
    }
}
