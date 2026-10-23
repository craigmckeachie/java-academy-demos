package com.pluralsight.workbook2b.objectarrays.solutions;

// Workbook 2b pp. 5-14: the Customer class IntelliJ generated in CodeGenerationDemo
// (the workbook uses float for the balance; we use double, the class standard)

public class Customer {
    private int id;
    private String name;
    private double outstandingBalance;

    public Customer(int id, String name, double outstandingBalance) {
        this.id = id;
        this.name = name;
        this.outstandingBalance = outstandingBalance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getOutstandingBalance() {
        return outstandingBalance;
    }

    public void setOutstandingBalance(double outstandingBalance) {
        this.outstandingBalance = outstandingBalance;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", outstandingBalance=" + outstandingBalance +
                '}';
    }
}
