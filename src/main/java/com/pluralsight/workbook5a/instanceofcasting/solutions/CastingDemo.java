package com.pluralsight.workbook5a.instanceofcasting.solutions;

import java.util.ArrayList;

public class CastingDemo {

    public static void main(String[] args) {
        // Workbook 5a p. 38, with the loop from p. 47's Assets example
        ArrayList<Human> people = new ArrayList<>();

        people.add(new Human());
        people.add(new Caveman());
        people.add(new ModernPerson());

        for (int index = 0; index < people.size(); index = index + 1) {
            people.get(index).eat();

            if (people.get(index) instanceof Caveman) {
                Caveman caveman = (Caveman) people.get(index); // safe: we just checked
                caveman.makeFire();
            }
        }
    }
}
