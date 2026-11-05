package com.pluralsight.workbook4a.getters.solutions;

public class BooleanGettersDemo {

    public static void main(String[] args) {
        // Workbook 4a p. 26
        Person dana = new Person("Dana", "Wyatt", 63);
        Person zachary = new Person("Zachary", "Wyatt", 17);

        System.out.println(dana.isAdult()); // true
        System.out.println(zachary.isAdult()); // false
    }
}
