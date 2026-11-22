package com.pluralsight.workbook6a.defaultmethods.solutions;

// Workbook 6a p. 33: a default method
public interface Flyable {
    default void fly() {
        System.out.println("Up, up and away!");
    }
}
