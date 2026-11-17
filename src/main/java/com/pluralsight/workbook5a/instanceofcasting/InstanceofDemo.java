package com.pluralsight.workbook5a.instanceofcasting;

import java.util.ArrayList;

public class InstanceofDemo {

    public static void main(String[] args) {
        // Workbook 5a pp. 42-43
        ArrayList<Human> people = new ArrayList<>();

        people.add(new Human());
        people.add(new Caveman());
        people.add(new ModernPerson());

        for (Human person : people) {
            if (person instanceof Human) {
                System.out.print("Human--> ");
            }
            if (person instanceof Caveman) {
                System.out.print("Caveman--> ");
            }
            if (person instanceof ModernPerson) {
                System.out.print("ModernPerson--> ");
            }
            person.eat();
        }
    }
}
