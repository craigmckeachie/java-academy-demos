package com.pluralsight.workbook6a.streammethods.solutions;

import java.util.Arrays;
import java.util.List;

public class CountDemo {

    public static void main(String[] args) {
        // Workbook 6a p. 74
        List<String> titles = Arrays.asList(
                "Halloween", "Ghost", "Halloween 2",
                "Friday the 13th", "Twister", "Halloween 3");

        long count = titles.stream()
                .filter(title -> title.toLowerCase().contains("halloween"))
                .count();
        System.out.println(count + " Halloween movies");
    }
}
