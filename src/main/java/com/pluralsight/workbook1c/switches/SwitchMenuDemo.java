package com.pluralsight.workbook1c.switches;

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

            // TODO: switch on command.toUpperCase(): "H" says hello, "C" counts to 3,
            //       "X" says goodbye, and default says the command is invalid
        }

        scanner.close();
    }
}
