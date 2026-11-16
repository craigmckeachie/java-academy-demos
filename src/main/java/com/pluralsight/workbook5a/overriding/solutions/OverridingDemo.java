package com.pluralsight.workbook5a.overriding.solutions;

public class OverridingDemo {

    public static void main(String[] args) {
        // Workbook 5a p. 35
        Human human = new Human();
        human.eat(); // Me hungry...

        Caveman caveman = new Caveman();
        caveman.eat(); // Me hunt lion and eat!

        ModernPerson modernPerson = new ModernPerson();
        modernPerson.eat(); // Me going to McDonalds and eat!
    }
}
