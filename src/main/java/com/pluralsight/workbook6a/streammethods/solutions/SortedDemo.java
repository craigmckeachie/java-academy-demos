package com.pluralsight.workbook6a.streammethods.solutions;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortedDemo {

    public static void main(String[] args) {
        // Workbook 6a pp. 75-76, with movies instead
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Twister", 1996, new BigDecimal("3.99")));
        movies.add(new Movie("Ghost", 1990, new BigDecimal("2.99")));
        movies.add(new Movie("Halloween", 1978, new BigDecimal("3.49")));
        movies.add(new Movie("Jaws", 1975, new BigDecimal("2.99")));
        movies.add(new Movie("Coco", 2017, new BigDecimal("4.99")));

        movies.stream()
                .map(movie -> movie.getTitle())
                .sorted()
                .forEach(System.out::println);

        System.out.println();

        // oldest first
        List<Movie> byYear = movies.stream()
                .sorted(Comparator.comparing(movie -> movie.getYear()))
                .toList();

        for (Movie movie : byYear) {
            System.out.println(movie.getYear() + " " + movie.getTitle());
        }
    }
}
