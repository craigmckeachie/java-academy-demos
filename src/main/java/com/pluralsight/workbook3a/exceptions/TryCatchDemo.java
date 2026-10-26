package com.pluralsight.workbook3a.exceptions;

import java.util.Scanner;

public class TryCatchDemo {

    public static void main(String[] args) {
        // Workbook 3a p. 8: pick a kid by number
        Scanner scanner = new Scanner(System.in);

        // TODO: wrap the lines below in try { ... } catch (Exception e) { ... }
        String[] names = {
                "Ezra", "Elisha", "Ian",
                "Siddalee", "Pursalane", "Zephaniah"
        };
        System.out.print("Pick a kid (select #1 - #6): ");
        int index = scanner.nextInt();
        index = index - 1;   // change number from range 1-6 to range 0-5
        System.out.println(names[index]);

        System.out.println("Goodbye!");
        scanner.close();
    }
}
