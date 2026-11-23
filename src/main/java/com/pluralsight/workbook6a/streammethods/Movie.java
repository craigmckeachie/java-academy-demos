package com.pluralsight.workbook6a.streammethods;

import java.math.BigDecimal;

public class Movie {
    private String title;
    private int year;
    private BigDecimal rentalPrice;

    public Movie(String title, int year, BigDecimal rentalPrice) {
        this.title = title;
        this.year = year;
        this.rentalPrice = rentalPrice;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public BigDecimal getRentalPrice() {
        return rentalPrice;
    }
}
