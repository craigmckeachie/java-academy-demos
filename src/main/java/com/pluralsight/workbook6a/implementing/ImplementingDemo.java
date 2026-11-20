package com.pluralsight.workbook6a.implementing;

public class ImplementingDemo {

    public static void main(String[] args) {
        // Workbook 6a p. 24
        Turtle turtle = new Turtle("Shelly");
        System.out.println(turtle.getName() + " starts at " + turtle.getCurrentLocation());
        // TODO: move the turtle 10 right and 5 up, print where it is, then send it home

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
