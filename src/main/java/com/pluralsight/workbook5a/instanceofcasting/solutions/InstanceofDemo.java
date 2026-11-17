package com.pluralsight.workbook5a.instanceofcasting.solutions;

import java.util.ArrayList;

public class InstanceofDemo {

    public static void main(String[] args) {
        // Workbook 5a pp. 42-43
        ArrayList<Human> people = new ArrayList<>();

        people.add(new Human());
        people.add(new Caveman());
        people.add(new ModernPerson());

        for (Human person : people) {
            // most specific first, and stop at the first match
            if (person instanceof ModernPerson) {
                System.out.print("ModernPerson--> ");
            } else if (person instanceof Caveman) {
                System.out.print("Caveman--> ");
            } else if (person instanceof Human) {
                System.out.print("Human--> ");
            }
            person.eat();
        }
    }
}
