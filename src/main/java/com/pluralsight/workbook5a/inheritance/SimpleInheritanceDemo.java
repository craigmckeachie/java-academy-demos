package com.pluralsight.workbook5a.inheritance;

public class SimpleInheritanceDemo {

    public static void main(String[] args) {
        // Workbook 5a p. 17
        Animal animal = new Animal();
        animal.setName("Bob");
        System.out.println(animal.getName());

        Dog dog = new Dog();
        // TODO: give the dog the name "Rubby"
        dog.setBreed("Corgi");

        // TODO: print the dog's name
        System.out.println(dog.getBreed());
        dog.bark();
    }
}
