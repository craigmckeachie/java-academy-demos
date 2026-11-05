package com.pluralsight.workbook4a.getters.solutions;

public class DerivedGettersDemo {

    public static void main(String[] args) {
        // Workbook 4a pp. 24-25
        Person person = new Person("Dana", "Wyatt", 63);

        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.getFullName()); // Dana Wyatt
    }
}
