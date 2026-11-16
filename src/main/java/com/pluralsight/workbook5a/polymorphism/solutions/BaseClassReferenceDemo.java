package com.pluralsight.workbook5a.polymorphism.solutions;

public class BaseClassReferenceDemo {

    public static void main(String[] args) {
        // Workbook 5a p. 37
        Human human = new Caveman(); // a Caveman is a Human
        human.eat(); // Me hunt lion and eat!

        // Workbook 5a p. 39
        Human plainHuman = new Human();
        feed("Human", plainHuman);

        Caveman caveman = new Caveman();
        feed("Caveman", caveman);

        ModernPerson modernPerson = new ModernPerson();
        feed("Modern Person", modernPerson);
    }

    // Any Human fits here: a Human, a Caveman or a ModernPerson
    public static void feed(String label, Human human) {
        System.out.print(label + "--> ");
        human.eat(); // the object decides which eat() runs
    }
}
