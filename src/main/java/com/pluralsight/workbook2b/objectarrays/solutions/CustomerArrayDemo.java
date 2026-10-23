package com.pluralsight.workbook2b.objectarrays.solutions;

public class CustomerArrayDemo {

    public static void main(String[] args) {
        // The generated Customer class in a fixed-size array (like Vehicle Inventory)
        Customer[] customers = new Customer[5];   // room for 5 customers

        customers[0] = new Customer(1, "Dana W.", 125.00);
        customers[1] = new Customer(2, "Natalie M.", 0.00);
        customers[2] = new Customer(3, "Zachary K.", 42.50);

        int count = 3;   // how many slots are filled

        System.out.println(customers[0]);

        for (int index = 0; index < count; index = index + 1) {
            System.out.println(customers[index]);
        }
    }
}
