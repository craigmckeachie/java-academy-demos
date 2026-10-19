package com.pluralsight.workbook2a.overloading.solutions;

public class OverloadingConstructorsDemo {

    public static void main(String[] args) {
        // Workbook 2a p. 54
        // This uses the parameterized constructor
        Person p1 = new Person("Dana", 63);

        // This uses the constructor without parameters and
        // then places data in the object using the setter methods
        Person p2 = new Person();
        p2.setName("Natalie");
        p2.setAge(37);

        System.out.println("P1's name is " + p1.getName());
        System.out.println("P2's name is " + p2.getName());

        // p. 55: display the person's information
        System.out.printf("%s is %d years old%n", p1.getName(), p1.getAge());
    }
}
