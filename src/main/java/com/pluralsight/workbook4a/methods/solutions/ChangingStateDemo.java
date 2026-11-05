package com.pluralsight.workbook4a.methods.solutions;

public class ChangingStateDemo {

    public static void main(String[] args) {
        // Workbook 4a p. 35
        String make = "Ford";
        String model = "Mustang";
        Car car1;
        car1 = new Car(make, model);

        System.out.println(car1.getSpeed()); // 0
        car1.accelerate(10);
        car1.accelerate(25);
        System.out.println(car1.getSpeed()); // 35
        car1.brake(10);
        System.out.println(car1.getSpeed()); // 25
    }
}
