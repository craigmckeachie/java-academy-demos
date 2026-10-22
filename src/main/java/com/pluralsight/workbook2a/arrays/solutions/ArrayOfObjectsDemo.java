package com.pluralsight.workbook2a.arrays.solutions;

public class ArrayOfObjectsDemo {

    public static void main(String[] args) {
        // Workbook 2a p. 39: an array can hold objects too
        // (p. 39 makes it size 4; we fill every slot so the loop below has no empty ones)
        Person[] family = new Person[3];   // 0, 1, 2 (3 - size)
        family[0] = new Person("Dana", 63);
        family[1] = new Person("Natalie", 37);
        family[2] = new Person("Zachary", 31);

        // one element: family[0] IS a Person, so it has Person's methods
        System.out.println(family[0].getName());     // Dana

        // every element: the same for-each as int[], with Person as the type
        for (Person currentPerson : family) {
            System.out.println(currentPerson.getName() + " is " + currentPerson.getAge());
        }
    }
}
