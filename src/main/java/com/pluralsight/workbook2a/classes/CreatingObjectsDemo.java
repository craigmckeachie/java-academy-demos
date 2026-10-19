package com.pluralsight.workbook2a.classes;

public class CreatingObjectsDemo {

    public static void main(String[] args) {
        // Workbook 2a p. 38: create the variable, then instantiate the object
        Person p1;
        p1 = new Person("Dana", 63);

        // p. 38: the values you pass to the constructor can come from variables
        String name = "Natalie";
        int age = 37;
        Person p2;
        p2 = new Person(name, age);

        // p. 39: declare the variable and instantiate the object in one step
        // TODO: create p3 (Zachary, 31) in one step

        System.out.println(p1.getName() + " is " + p1.getAge());
        System.out.println(p2.getName() + " is " + p2.getAge());
        // TODO: print p3
    }
}
