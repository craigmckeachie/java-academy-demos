package com.pluralsight.workbook5a.inheritance.solutions;

public class SimpleInheritanceDemo {

    public static void main(String[] args) {
        // Workbook 5a p. 17
        Animal animal = new Animal();
        animal.setName("Bob");
        System.out.println(animal.getName());

        Dog dog = new Dog();
        dog.setName("Rubby"); // inherited from Animal
        dog.setBreed("Corgi");

        System.out.println(dog.getName()); // Rubby
        System.out.println(dog.getBreed()); // Corgi
        dog.bark(); // Ruff, ruff!
    }
}
