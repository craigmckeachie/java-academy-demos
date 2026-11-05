package com.pluralsight.workbook4a.statics;

import java.math.BigDecimal;

public class InstanceAndStaticDemo {

    public static void main(String[] args) {
        // Workbook 4a pp. 76 and 78
        BankAccount acct1 = new BankAccount("109", "Bob", new BigDecimal("745.00"));
        BankAccount acct2 = new BankAccount("45", "Susan", new BigDecimal("1000.00"));

        // Each object has its own balance
        acct1.deposit(new BigDecimal("5.00"));
        System.out.println(acct1.getBalance());
        System.out.println(acct2.getBalance());

        // The class has one interest rate
        // TODO: set the interest rate on the class
        System.out.println(BankAccount.getInterestRate());

        // TODO: change it once, then print it again
    }
}
