package com.pluralsight.workbook5a.instanceofcasting.solutions;

import java.util.ArrayList;

public class CastingDemo {

    public static void main(String[] args) {
        // Workbook 5a p. 38, with the loop from p. 47's Assets example
        ArrayList<Human> people = new ArrayList<>();

        people.add(new Human());
        people.add(new Caveman());
        people.add(new ModernPerson());

        for (Human person : people) {
            person.eat();

            if (person instanceof Caveman caveman) { // check and cast in one step
                caveman.makeFire();
            }
        }
    }
}
