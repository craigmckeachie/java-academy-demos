package com.pluralsight.workbook6a.streammethods.solutions;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ReduceDemo {

    public static void main(String[] args) {
        // Workbook 6a p. 78, with movies instead
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Twister", 1996, new BigDecimal("3.99")));
        movies.add(new Movie("Ghost", 1990, new BigDecimal("2.99")));
        movies.add(new Movie("Halloween", 1978, new BigDecimal("3.49")));
        movies.add(new Movie("Jaws", 1975, new BigDecimal("2.99")));
        movies.add(new Movie("Coco", 2017, new BigDecimal("4.99")));

        // the loop you already know
        BigDecimal loopTotal = BigDecimal.ZERO;
        for (Movie movie : movies) {
            loopTotal = loopTotal.add(movie.getRentalPrice());
        }
        System.out.println("With a loop: $" + loopTotal);

        // the same total, as a stream
        BigDecimal total = movies.stream()
                .map(movie -> movie.getRentalPrice())
                .reduce(BigDecimal.ZERO, (sum, price) -> sum.add(price));
        System.out.println("With a stream: $" + total);
    }
}
