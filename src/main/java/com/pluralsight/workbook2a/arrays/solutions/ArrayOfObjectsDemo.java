package com.pluralsight.workbook2a.arrays.solutions;

public class ArrayOfObjectsDemo {

    public static void main(String[] args) {
        // Workbook 2a p. 39: an array can hold objects too
        Person[] family = new Person[4];   // 0, 1, 2, 3 (4 - size)
        family[0] = new Person("Dana", 63);
        family[1] = new Person("Natalie", 37);

        System.out.println(family[0].getName());     // Dana
        System.out.println(family[1].getName());     // Natalie
    }
}
