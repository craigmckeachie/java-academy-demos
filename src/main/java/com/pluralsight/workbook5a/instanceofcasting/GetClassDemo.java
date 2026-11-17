package com.pluralsight.workbook5a.instanceofcasting;

import java.util.ArrayList;

public class GetClassDemo {

    public static void main(String[] args) {
        // Workbook 5a pp. 44-45
        ArrayList<Human> people = new ArrayList<>();

        people.add(new Human());
        people.add(new Caveman());
        people.add(new ModernPerson());

        for (Human person : people) {
            // TODO: print the class name, then "--> "
            person.eat();
        }

        // TODO: print the first person
    }
}
