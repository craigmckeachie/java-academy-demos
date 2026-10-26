package com.pluralsight.workbook3a.arraylists;

import java.util.ArrayList;

public class ChangingListDemo {

    public static void main(String[] args) {
        // Workbook 3a pp. 44-45: change and remove items by index
        ArrayList<String> kids = new ArrayList<>();
        kids.add("Natalie");
        kids.add("Brittany");
        kids.add("Zachary");
        System.out.println(kids);

        // TODO: p. 44: set index 2 to "Zach"

        System.out.println(kids);

        // TODO: p. 45: remove index 1

        System.out.println(kids);
        System.out.println(kids.get(1));
        System.out.println(kids.size());
    }
}
