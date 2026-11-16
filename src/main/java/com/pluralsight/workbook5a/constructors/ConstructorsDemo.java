package com.pluralsight.workbook5a.constructors;

public class ConstructorsDemo {

    public static void main(String[] args) {
        // Workbook 5a p. 28
        Animal animal1 = new Animal();
        System.out.println("animal1's name is " + animal1.getName() + "\n");

        Animal animal2 = new Animal("Elmo");
        System.out.println("animal2's name is " + animal2.getName() + "\n");

        Dog dog1 = new Dog();
        System.out.println("dog1's name is " + dog1.getName()
                + " and their breed is " + dog1.getBreed() + "\n");

        // TODO: create dog2 named "Fido", a "Mutt", and print its name and breed
    }
}
