package com.pluralsight.workbook3a.screens.solutions;

import java.util.Scanner;

public class ScreenLoopDemo {
    // one Scanner for the whole app, so every screen and action can use it
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        runHomeScreen();
    }

    // a screen: a menu that repeats until the user picks the way out
    public static void runHomeScreen() {
        String command;
        do {
            System.out.println();
            System.out.println("=== Home ===");
            System.out.println("A) Add Movie");
            System.out.println("X) Exit");
            System.out.print("Enter a command: ");
            command = scanner.nextLine().trim().toUpperCase();

            switch (command) {
                case "A" -> System.out.println("TODO: add a movie");
                case "X" -> System.out.println("Goodbye!");
                default -> System.out.println("That isn't a command. Try again.");
            }
        } while (!command.equals("X"));
    }
}
