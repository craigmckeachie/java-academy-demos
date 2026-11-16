package com.pluralsight.workbook5a.polymorphism;

import java.util.ArrayList;

public class HumanListDemo {

    public static void main(String[] args) {
        // Workbook 5a p. 40
        ArrayList<Human> people = new ArrayList<>();

        people.add(new Human());
        people.add(new Caveman());
        people.add(new ModernPerson());

        // TODO: loop through people and call eat() on each one
    }
}
