package com.pluralsight.workbook1c.switches.solutions;

import java.util.Scanner;

public class SwitchMenuDemo {

    public static void main(String[] args) {
        // a menu: the user types a letter, and a switch picks what to do
        Scanner scanner = new Scanner(System.in);

        String command = "";
        while (!command.equalsIgnoreCase("X")) {
            System.out.println("H) Say hello");
            System.out.println("C) Count to 3");
            System.out.println("X) Exit");
            System.out.print("Enter a command: ");
            command = scanner.nextLine();

            // toUpperCase() lets the user type h or H
            switch (command.toUpperCase()) {
                case "H" -> {
                    System.out.println("Hello!");
                }
                case "C" -> {
                    System.out.println("1, 2, 3");
                }
                case "X" -> {
                    System.out.println("Goodbye!");
                }
                default -> {
                    System.out.println("That isn't a command. Try again.");
                }
            }
        }

        scanner.close();
    }
}
