package com.pluralsight.workbook3a.screens.solutions;

import java.util.Scanner;

public class NestedScreensDemo {
    // one Scanner for the whole app, so every screen method can use it
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        runParentScreen();
    }

    // LEVEL 1: the parent screen (in the Capstone, the Home screen)
    private static void runParentScreen() {
        boolean isRunning = true;
        while (isRunning) {
            System.out.print("""
                \n[LEVEL 1: PARENT SCREEN]
                1) Open Child Screen A (Has Grandchild)
                2) Open Child Screen B (No Grandchild)
                X) Exit Application
                Enter command: \s""");

            String choice = scanner.nextLine().toLowerCase().trim();
            switch (choice) {
                case "1" -> runChildAScreen();
                case "2" -> runChildBScreen();
                case "x" -> isRunning = false;
                default -> System.out.println("Invalid input.");
            }
        }
    }

    // LEVEL 2: child A, the "deep" branch (in the Capstone, the Ledger screen)
    private static void runChildAScreen() {
        boolean inChildA = true;
        while (inChildA) {
            System.out.print("""
                \n  [LEVEL 2: CHILD SCREEN A]
                  1) Open Grandchild Screen
                  A) Perform Child-Level Action
                  R) Return to Parent
                  Enter command: \s""");

            String choice = scanner.nextLine().toLowerCase().trim();
            switch (choice) {
                case "1" -> runGrandchildScreen(); // goes down to level 3
                case "a" -> System.out.println("  [Action] Logic executed in Child A.");
                case "r" -> inChildA = false; // the loop ends, the method returns, back to level 1
                default -> System.out.println("  Invalid input.");
            }
        }
    }

    // LEVEL 2: child B, the "shallow" branch
    private static void runChildBScreen() {
        boolean inChildB = true;
        while (inChildB) {
            System.out.print("""
                \n  [LEVEL 2: CHILD SCREEN B]
                  A) Perform Child-Level Action
                  R) Return to Parent
                  Enter command: \s""");

            String choice = scanner.nextLine().toLowerCase().trim();
            switch (choice) {
                case "a" -> System.out.println("  [Action] Logic executed in Child B.");
                case "r" -> inChildB = false;
                default -> System.out.println("  Invalid input.");
            }
        }
    }

    // LEVEL 3: the grandchild, only reached from child A (in the Capstone, the Reports screen)
    private static void runGrandchildScreen() {
        boolean inGrandchild = true;
        while (inGrandchild) {
            System.out.println("\n    [LEVEL 3: GRANDCHILD SCREEN]");
            System.out.print("""
                \n    Options:
                    A) Perform Grandchild Action
                    B) Back to Child Screen A
                    Enter command: \s""");

            String choice = scanner.nextLine().toLowerCase().trim();
            switch (choice) {
                case "a" -> System.out.println("    [Action] Logic executed in Grandchild.");
                case "b" -> inGrandchild = false; // back to level 2
                default -> System.out.println("    Invalid input.");
            }
        }
    }
}
