package com.pluralsight.workbook6a.streammethods.solutions;

import java.util.Arrays;
import java.util.List;

public class MapDemo {

    public static void main(String[] args) {
        // Workbook 6a p. 77
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

        List<Integer> squares = numbers.stream()
                .map(number -> number * number)
                .toList();
        System.out.println(squares);

        List<Integer> uniqueSquares = numbers.stream()
                .map(number -> number * number)
                .distinct()
                .toList();
        System.out.println(uniqueSquares);
    }
}
