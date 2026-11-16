package com.pluralsight.workbook5a.polymorphism.solutions;

import java.util.ArrayList;

public class HumanListDemo {

    public static void main(String[] args) {
        // Workbook 5a p. 40
        ArrayList<Human> people = new ArrayList<>();

        people.add(new Human());
        people.add(new Caveman());
        people.add(new ModernPerson());

        for (int index = 0; index < people.size(); index = index + 1) {
            people.get(index).eat(); // each one eats its own way
        }
    }
}
