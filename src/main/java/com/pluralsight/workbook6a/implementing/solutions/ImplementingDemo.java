package com.pluralsight.workbook6a.implementing.solutions;

public class ImplementingDemo {

    public static void main(String[] args) {
        // Workbook 6a p. 24
        Turtle turtle = new Turtle("Shelly");
        System.out.println(turtle.getName() + " starts at " + turtle.getCurrentLocation());
        turtle.move(10, 5);
        System.out.println("After moving: " + turtle.getCurrentLocation());
        turtle.goHome();
        System.out.println("Back home: " + turtle.getCurrentLocation());

        // Workbook 6a p. 25
        Robot robot = new Robot("Robbie");
        robot.move(30, 40);
        System.out.println(robot.getCurrentLocation() + ", power " + robot.getPower());
        robot.move(50, 10);
        System.out.println(robot.getCurrentLocation() + ", power " + robot.getPower());
        robot.move(20, 20);
        System.out.println(robot.getCurrentLocation() + ", power " + robot.getPower());
    }
}
