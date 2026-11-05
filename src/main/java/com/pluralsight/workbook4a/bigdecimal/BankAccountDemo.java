package com.pluralsight.workbook4a.bigdecimal;

import java.math.BigDecimal;

public class BankAccountDemo {

    public static void main(String[] args) {
        // Workbook 4a p. 71 (the workbook names this class Main)
        BankAccount account = new BankAccount("100.00");

        account.deposit(new BigDecimal("50.00"));
        System.out.println("After deposit: " + account.getBalance());

        account.withdraw(new BigDecimal("30.00"));
        System.out.println("After withdrawal: " + account.getBalance());

        account.withdraw(new BigDecimal("1000.00"));
        System.out.println("Final balance: " + account.getBalance());
    }
}
