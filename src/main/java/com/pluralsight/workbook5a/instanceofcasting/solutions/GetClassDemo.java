package com.pluralsight.workbook5a.instanceofcasting.solutions;

import java.util.ArrayList;

public class GetClassDemo {

    public static void main(String[] args) {
        // Workbook 5a pp. 44-45
        ArrayList<Human> people = new ArrayList<>();

        people.add(new Human());
        people.add(new Caveman());
        people.add(new ModernPerson());

        for (Human person : people) {
            System.out.print(person.getClass().getSimpleName() + "--> ");
            person.eat();
        }

        // p. 45: every class extends Object, so every object has toString()
        System.out.println(people.get(0)); // the default: the class name, @, then a code
    }
}
