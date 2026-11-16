package com.pluralsight.workbook5a.overriding;

public class OverridingDemo {

    public static void main(String[] args) {
        // Workbook 5a p. 35
        Human human = new Human();
        human.eat();

        Caveman caveman = new Caveman();
        caveman.eat();

        ModernPerson modernPerson = new ModernPerson();
        modernPerson.eat();
    }
}
