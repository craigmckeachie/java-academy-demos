package com.pluralsight.workbook6a.streammethods.solutions;

import java.util.Arrays;
import java.util.List;

public class SortedDemo {

    public static void main(String[] args) {
        // Workbook 6a pp. 75-76
        List<String> titles = Arrays.asList(
                "Halloween", "Ghost", "Halloween 2",
                "Friday the 13th", "Twister", "Halloween 3");

        titles.stream()
                .filter(title -> title.toLowerCase().contains("halloween"))
                .sorted()
                .forEach(title -> System.out.println(title));

        System.out.println();

        titles.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
