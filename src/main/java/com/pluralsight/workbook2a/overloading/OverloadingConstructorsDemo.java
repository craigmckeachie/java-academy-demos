package com.pluralsight.workbook2a.overloading;

public class OverloadingConstructorsDemo {

    public static void main(String[] args) {
        // Workbook 2a p. 54
        // This uses the parameterized constructor
        Person p1 = new Person("Dana", 63);

        // This uses the constructor without parameters and
        // then places data in the object using the setter methods
        // TODO: create p2 with the no-parameter constructor, then use the setters (Natalie, 37)

        System.out.println("P1's name is " + p1.getName());
        // TODO: print p2's name

        // p. 55: display the person's information
        System.out.printf("%s is %d years old%n", p1.getName(), p1.getAge());
    }
}
