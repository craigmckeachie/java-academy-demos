package com.pluralsight.workbook5a.instanceofcasting.solutions;

import java.util.ArrayList;

public class InstanceofDemo {

    public static void main(String[] args) {
        // Workbook 5a pp. 42-43
        ArrayList<Human> people = new ArrayList<>();

        people.add(new Human());
        people.add(new Caveman());
        people.add(new ModernPerson());

        for (int index = 0; index < people.size(); index = index + 1) {
            // most specific first, and stop at the first match
            if (people.get(index) instanceof ModernPerson) {
                System.out.print("ModernPerson--> ");
            } else if (people.get(index) instanceof Caveman) {
                System.out.print("Caveman--> ");
            } else if (people.get(index) instanceof Human) {
                System.out.print("Human--> ");
            }
            people.get(index).eat();
        }
    }
}
