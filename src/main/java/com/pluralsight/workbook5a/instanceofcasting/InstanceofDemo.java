package com.pluralsight.workbook5a.instanceofcasting;

import java.util.ArrayList;

public class InstanceofDemo {

    public static void main(String[] args) {
        // Workbook 5a pp. 42-43
        ArrayList<Human> people = new ArrayList<>();

        people.add(new Human());
        people.add(new Caveman());
        people.add(new ModernPerson());

        for (int index = 0; index < people.size(); index = index + 1) {
            if (people.get(index) instanceof Human) {
                System.out.print("Human--> ");
            }
            if (people.get(index) instanceof Caveman) {
                System.out.print("Caveman--> ");
            }
            if (people.get(index) instanceof ModernPerson) {
                System.out.print("ModernPerson--> ");
            }
            people.get(index).eat();
        }
    }
}
