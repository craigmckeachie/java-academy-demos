package com.pluralsight.workbook2b.objectarrays;

import java.util.Scanner;

public class CustomerMenuDemo {

    public static void main(String[] args) {
        // A menu loop over the customer array (like Vehicle Inventory Part 3)
        Customer[] customers = new Customer[5];   // room for 5 customers

        customers[0] = new Customer(1, "Dana W.", 125.00);
        customers[1] = new Customer(2, "Natalie M.", 0.00);
        customers[2] = new Customer(3, "Zachary K.", 42.50);

        Scanner scanner = new Scanner(System.in);

        int command = 0;
        while (command != 3) {
            System.out.println();
            System.out.println("What do you want to do?");
            System.out.println("  1 - List all customers");
            System.out.println("  2 - Search by name");
            System.out.println("  3 - Quit");
            System.out.print("Enter your command: ");
            command = scanner.nextInt();
            scanner.nextLine();   // the leftover newline (Workbook 1c)

            switch (command) {
                case 1 -> listAllCustomers(customers);
                // TODO: case 2 calls findCustomersByName
                case 3 -> System.out.println("Goodbye!");
                default -> System.out.println("Invalid command, try again.");
            }
        }
    }

    // the for-each from CustomerArrayDemo, moved into its own method
    public static void listAllCustomers(Customer[] customers) {
        for (Customer currentCustomer : customers) {
            if (currentCustomer != null) {
                System.out.println(currentCustomer);
            }
        }
    }

    public static void findCustomersByName(Customer[] customers, Scanner scanner) {
        System.out.print("Enter a name: ");
        String name = scanner.nextLine();

        // TODO: print every customer whose name matches, ignoring upper/lower case (skip the empty slots)
    }
}
