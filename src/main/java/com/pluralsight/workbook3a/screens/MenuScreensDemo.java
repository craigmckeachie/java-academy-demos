package com.pluralsight.workbook3a.screens;

import java.util.Scanner;

public class MenuScreensDemo {
    // one Scanner for the whole app, so every screen and action can use it
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        runHomeScreen();
    }

    // ---------- Screens: a menu that repeats until the user picks the way out ----------

    public static void runHomeScreen() {
        // TODO: show this menu again and again, until the user types X
        String command;
        System.out.println();
        System.out.println("=== Home ===");
        System.out.println("A) Add Movie");
        System.out.println("B) Browse Movies");
        System.out.println("X) Exit");
        System.out.print("Enter a command: ");
        command = scanner.nextLine().trim().toUpperCase();

        switch (command) {
            case "A" -> addMovie();
            // TODO: B opens the Browse Movies screen
            case "X" -> System.out.println("Goodbye!");
            default -> System.out.println("That isn't a command. Try again.");
        }
    }

    public static void runBrowseScreen() {
        String command;
        do {
            System.out.println();
            System.out.println("=== Browse Movies ===");
            System.out.println("A) All Movies");
            System.out.println("W) Watched");
            System.out.println("U) Unwatched");
            System.out.println("S) Search");
            System.out.println("H) Home");
            System.out.print("Enter a command: ");
            command = scanner.nextLine().trim().toUpperCase();

            switch (command) {
                case "A" -> displayAllMovies();
                case "W" -> displayWatchedMovies();
                case "U" -> displayUnwatchedMovies();
                // TODO: S opens the Search screen
                case "H" -> System.out.println("Back to Home");
                default -> System.out.println("That isn't a command. Try again.");
            }
        } while (!command.equals("H"));
    }

    public static void runSearchScreen() {
        String command;
        do {
            System.out.println();
            System.out.println("=== Search ===");
            System.out.println("1) By Title");
            System.out.println("2) By Year");
            System.out.println("0) Back");
            System.out.print("Enter a command: ");
            command = scanner.nextLine().trim().toUpperCase();

            switch (command) {
                case "1" -> searchByTitle();
                case "2" -> searchByYear();
                case "0" -> System.out.println("Back to Browse Movies");
                default -> System.out.println("That isn't a command. Try again.");
            }
        } while (!command.equals("0"));
    }

    // ---------- Actions: do one thing, then return to the screen ----------

    public static void addMovie() {
        System.out.print("Title: ");
        String title = scanner.nextLine();
        System.out.print("Year: ");
        // read the whole line, then turn it into a number
        int year = Integer.parseInt(scanner.nextLine());

        System.out.println("Added " + title + " (" + year + ")");
    }

    public static void displayAllMovies() {
        System.out.println("TODO: display all movies");
    }

    public static void displayWatchedMovies() {
        System.out.println("TODO: display the movies you've watched");
    }

    public static void displayUnwatchedMovies() {
        System.out.println("TODO: display the movies you haven't watched");
    }

    public static void searchByTitle() {
        System.out.print("Title to search for: ");
        String title = scanner.nextLine();

        System.out.println("TODO: display the movies whose title matches " + title);
    }

    public static void searchByYear() {
        System.out.print("Year to search for: ");
        int year = Integer.parseInt(scanner.nextLine());

        System.out.println("TODO: display the movies from " + year);
    }

    // TODO: call this at the end of every action
    public static void pressEnterToContinue() {
        System.out.println();
        System.out.print("Press Enter to go back to the menu...");
        scanner.nextLine();
    }
}
