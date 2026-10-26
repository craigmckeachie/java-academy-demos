package com.pluralsight.workbook3a.arraylists;

import java.util.ArrayList;

public class ListOfObjectsDemo {

    public static void main(String[] args) {
        // Workbook 3a pp. 47-48: an ArrayList can hold objects, like an array of objects
        ArrayList<Person> people = new ArrayList<>();

        Person person = new Person("Natalie", 28);
        people.add(person);

        // TODO: add two more people in one line each: people.add(new Person(...));

        System.out.println(people.size());

        for (Person currentPerson : people) {
            System.out.printf("%s is %d%n", currentPerson.getName(), currentPerson.getAge());
        }
    }
}
