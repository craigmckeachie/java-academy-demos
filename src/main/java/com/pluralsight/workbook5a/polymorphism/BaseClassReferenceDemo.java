package com.pluralsight.workbook5a.polymorphism;

public class BaseClassReferenceDemo {

    public static void main(String[] args) {
        // Workbook 5a p. 37
        Human human = new Caveman();
        human.eat();

        // Workbook 5a p. 39
        Human plainHuman = new Human();
        feed("Human", plainHuman);

        Caveman caveman = new Caveman();
        // TODO: feed the caveman

        ModernPerson modernPerson = new ModernPerson();
        // TODO: feed the modern person
    }

    public static void feed(String label, Human human) {
        System.out.print(label + "--> ");
        human.eat();
    }
}
