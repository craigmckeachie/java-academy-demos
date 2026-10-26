package com.pluralsight.workbook3a.exceptions.solutions;

import java.util.Scanner;

public class TryCatchDemo {

    public static void main(String[] args) {
        // Workbook 3a p. 8: pick a kid by number
        Scanner scanner = new Scanner(System.in);

        try {
            String[] names = {
                    "Ezra", "Elisha", "Ian",
                    "Siddalee", "Pursalane", "Zephaniah"
            };
            System.out.print("Pick a kid (select #1 - #6): ");
            int index = scanner.nextInt();
            index = index - 1;   // change number from range 1-6 to range 0-5
            // any number outside 1-6 makes the index out of range
            System.out.println(names[index]);
        } catch (Exception e) {
            System.out.println("Your number was out of range!");
            // print the details so the error is never hidden from you
            e.printStackTrace();
        }

        // the program keeps going after the catch
        System.out.println("Goodbye!");
        scanner.close();
    }
}
