package com.pluralsight.workbook4a.getters;

// Workbook 4a pp. 24 and 26, combined into one Person with a constructor
public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    // TODO: getFullName(), a derived getter

    // TODO: isAdult(), a boolean getter
}
