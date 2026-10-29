package com.pluralsight.workbook3a.screens;

import java.util.Scanner;

public class ActionsDemo {
    // one Scanner for the whole app, so every screen and action can use it
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        runHomeScreen();
    }

    // ---------- Screens: a menu that repeats until the user picks the way out ----------

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

    // ---------- Actions: do one thing, wait for Enter, then return to the screen ----------

    public static void addMovie() {
        System.out.print("Title: ");
        String title = scanner.nextLine();
        System.out.print("Year: ");
        // read the whole line, then turn it into a number
        int year = Integer.parseInt(scanner.nextLine());

        System.out.println("Added " + title + " (" + year + ")");
    }

    // TODO: call this at the end of every action
    public static void pressEnterToContinue() {
        System.out.println();
        System.out.print("Press Enter to go back to the menu...");
        scanner.nextLine();
    }
}
