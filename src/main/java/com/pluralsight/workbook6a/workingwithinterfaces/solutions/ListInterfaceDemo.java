package com.pluralsight.workbook6a.workingwithinterfaces.solutions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListInterfaceDemo {

    public static void main(String[] args) {
        // Workbook 6a p. 37
        List<String> names = new ArrayList<>();
        names.add("Ezra");
        names.add("Ian");
        System.out.println("ArrayList: " + names);

        names = new LinkedList<>();
        names.add("Siddalee");
        names.add("Elisha");
        System.out.println("LinkedList: " + names);
    }
}
