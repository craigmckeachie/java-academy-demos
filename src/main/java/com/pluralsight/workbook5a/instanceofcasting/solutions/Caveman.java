package com.pluralsight.workbook5a.instanceofcasting.solutions;

// Workbook 5a p. 36, plus makeFire(), which only a Caveman has
public class Caveman extends Human {

    @Override
    public void eat() {
        System.out.println("Me hunt lion and eat!");
    }

    public void makeFire() {
        System.out.println("Me make fire!");
    }
}
