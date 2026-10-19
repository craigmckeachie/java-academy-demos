package com.pluralsight.workbook2a.overloading;

public class OverloadingDemo {

    public static void main(String[] args) {
        // 2-1: create an object, fill it with setters, read it with getters
        Pet pet1 = new Pet();
        pet1.setName("Biscuit");
        pet1.setSpecies("dog");
        pet1.setAge(3);

        Pet pet2 = new Pet();
        pet2.setName("Mochi");
        pet2.setSpecies("cat");
        pet2.setAge(5);

        // 2-2: action methods and passing objects to a method
        pet1.giveTreat();
        pet1.giveTreat();

        printPet(pet1);
        printPet(pet2);

        System.out.println(pet1.getName() + " says " + pet1.speak());
        System.out.println(pet2.getName() + " says " + pet2.speak());
    }

    public static void printPet(Pet pet) {
        System.out.printf("%s the %s, age %d, treats today: %d%n",
                pet.getName(), pet.getSpecies(), pet.getAge(), pet.getTreatsToday());
    }
}
