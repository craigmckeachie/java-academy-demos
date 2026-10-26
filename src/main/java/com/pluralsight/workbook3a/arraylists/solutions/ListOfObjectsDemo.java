package com.pluralsight.workbook3a.arraylists.solutions;

import java.util.ArrayList;

public class ListOfObjectsDemo {

    public static void main(String[] args) {
        // Workbook 3a pp. 47-48: an ArrayList can hold objects, like an array of objects
        ArrayList<Person> people = new ArrayList<>();

        Person person = new Person("Natalie", 28);
        people.add(person);

        // create the object and add it in one step
        people.add(new Person("Brittany", 31));
        people.add(new Person("Zachary", 19));

        System.out.println(people.size());           // 3

        for (Person currentPerson : people) {
            System.out.printf("%s is %d%n", currentPerson.getName(), currentPerson.getAge());
        }
    }
}
