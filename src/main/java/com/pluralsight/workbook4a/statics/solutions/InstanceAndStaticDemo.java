package com.pluralsight.workbook4a.statics.solutions;

import java.math.BigDecimal;

public class InstanceAndStaticDemo {

    public static void main(String[] args) {
        // Workbook 4a pp. 76 and 78
        BankAccount acct1 = new BankAccount("109", "Bob", new BigDecimal("745.00"));
        BankAccount acct2 = new BankAccount("45", "Susan", new BigDecimal("1000.00"));

        // Each object has its own balance
        acct1.deposit(new BigDecimal("5.00"));
        System.out.println(acct1.getBalance()); // 750.00
        System.out.println(acct2.getBalance()); // 1000.00

        // The class has one interest rate
        BankAccount.setInterestRate(new BigDecimal("0.045"));
        System.out.println(BankAccount.getInterestRate()); // 0.045

        BankAccount.setInterestRate(new BigDecimal("0.05"));
        System.out.println(BankAccount.getInterestRate()); // 0.05
    }
}
