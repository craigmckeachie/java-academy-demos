package com.pluralsight.workbook2a.objects;

public class ObjectMethodsDemo {

    public static void main(String[] args) {
        Pet pet1 = new Pet();
        pet1.setName("Biscuit");
        pet1.setSpecies("dog");
        pet1.setAge(3);

        System.out.println(pet1.getName() + " is a " + pet1.getAge() + "-year-old " + pet1.getSpecies() + ".");

        Pet pet2 = new Pet();
        pet2.setName("Mochi");
        pet2.setSpecies("cat");
        pet2.setAge(5);

        System.out.println(pet2.getName() + " is a " + pet2.getAge() + "-year-old " + pet2.getSpecies() + ".");
    }
}
