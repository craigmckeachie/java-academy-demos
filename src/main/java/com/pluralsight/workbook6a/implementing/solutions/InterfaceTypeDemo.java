package com.pluralsight.workbook6a.implementing.solutions;

public class InterfaceTypeDemo {

    public static void main(String[] args) {
        // Workbook 6a pp. 24-25: one variable, anything that can move
        Movable mover = new Robot("Robbie");
        Point location = mover.move(3, 4);
        System.out.println("The robot is at " + location);

        mover = new Turtle("Shelly");
        location = mover.move(3, 4);
        System.out.println("The turtle is at " + location);
    }
}
