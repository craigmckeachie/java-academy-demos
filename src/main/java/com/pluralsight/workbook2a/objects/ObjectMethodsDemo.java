package com.pluralsight.workbook2a.objects;

public class ObjectMethodsDemo {

    public static void main(String[] args) {
        // Workbook 2a p. 47 (the workbook names this class MainApp)
        Person person = new Person("Dana", 63);
        System.out.println(person.getEnergy());
        // TODO: work for 5 hours
        System.out.println(person.getEnergy());
        person.eat(); // this will add energy
        System.out.println(person.getEnergy());
    }
}
