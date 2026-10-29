package com.pluralsight.workbook3a.screens.solutions;

import java.util.Scanner;

public class SecondScreenDemo {
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
            System.out.println("B) Browse Movies");
            System.out.println("X) Exit");
            System.out.print("Enter a command: ");
            command = scanner.nextLine().trim().toUpperCase();

            switch (command) {
                case "A" -> addMovie();
                case "B" -> runBrowseScreen();
                case "X" -> System.out.println("Goodbye!");
                default -> System.out.println("That isn't a command. Try again.");
            }
        } while (!command.equals("X"));
    }

    public static void runBrowseScreen() {
        String command;
        do {
            System.out.println();
            System.out.println("=== Browse Movies ===");
            System.out.println("A) All Movies");
            System.out.println("W) Watched");
            System.out.println("U) Unwatched");
            System.out.println("H) Home");
            System.out.print("Enter a command: ");
            command = scanner.nextLine().trim().toUpperCase();

            switch (command) {
                case "A" -> displayAllMovies();
                case "W" -> displayWatchedMovies();
                case "U" -> displayUnwatchedMovies();
                case "H" -> System.out.println("Back to Home");
                default -> System.out.println("That isn't a command. Try again.");
            }
        } while (!command.equals("H"));
    }

    // ---------- Actions: do one thing, wait for Enter, then return to the screen ----------

    public static void addMovie() {
        System.out.print("Title: ");
        String title = scanner.nextLine();
        System.out.print("Year: ");
        // read the whole line, then turn it into a number
        int year = Integer.parseInt(scanner.nextLine());

        System.out.println("Added " + title + " (" + year + ")");
        pressEnterToContinue();
    }

    public static void displayAllMovies() {
        System.out.println("TODO: display all movies");
        pressEnterToContinue();
    }

    public static void displayWatchedMovies() {
        System.out.println("TODO: display the movies you've watched");
        pressEnterToContinue();
    }

    public static void displayUnwatchedMovies() {
        System.out.println("TODO: display the movies you haven't watched");
        pressEnterToContinue();
    }

    // the results stay on screen until the user is ready to see the menu again
    public static void pressEnterToContinue() {
        System.out.println();
        System.out.print("Press Enter to go back to the menu...");
        scanner.nextLine();
    }
}
