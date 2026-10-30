package com.pluralsight.workbook3a.validation.solutions;

import java.time.LocalDate;
import java.util.Scanner;

public class ValidatingInputDemo {
    // one Scanner for the whole app, so every screen, action and helper can use it
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
                case "A" -> addMovie();
                case "X" -> System.out.println("Goodbye!");
                default -> System.out.println("That isn't a command. Try again.");
            }
        } while (!command.equals("X"));
    }

    // ---------- Actions: do one thing, wait for Enter, then return to the screen ----------

    public static void addMovie() {
        String title = promptForString("Title: ");
        int year = promptForInt("Year: ");
        // a rule about this one value: the action checks it, not the helper
        while (year > LocalDate.now().getYear()) {
            System.out.println("The year can't be in the future.");
            year = promptForInt("Year: ");
        }

        System.out.println("Added " + title + " (" + year + ")");
        pressEnterToContinue();
    }

    // the results stay on screen until the user is ready to see the menu again
    public static void pressEnterToContinue() {
        System.out.println();
        System.out.print("Press Enter to go back to the menu...");
        scanner.nextLine();
    }

    // ---------- Input helpers: ask until the answer is good, then return it ----------

    // asks until the user types a whole number
    public static int promptForInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                // return leaves the method, so it leaves the loop too
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a whole number, like 12.");
            }
        }
    }

    // asks until the user types something, without a | (it would break a file split on |)
    public static String promptForString(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("This can't be blank.");
            } else if (input.contains("|")) {
                System.out.println("Please don't use the | character.");
            } else {
                return input;
            }
        }
    }
}
