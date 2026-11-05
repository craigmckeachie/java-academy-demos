package com.pluralsight.workbook4a.statics.solutions;

import java.math.BigDecimal;

// Workbook 4a p. 77, with getBalance() added so the demo can print each balance
public class BankAccount {
    private static BigDecimal interestRate;

    private String number;
    private String name;
    private BigDecimal balance;

    public BankAccount(String number, String name, BigDecimal balance) {
        this.number = number;
        this.name = name;
        this.balance = balance;
    }

    public static BigDecimal getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(BigDecimal interestRate) {
        BankAccount.interestRate = interestRate;
    }

    public void deposit(BigDecimal amount) {
        this.balance = this.balance.add(amount);
    }

    public void withdraw(BigDecimal amount) {
        this.balance = this.balance.subtract(amount);
    }

    public BigDecimal getBalance() {
        return this.balance;
    }
}
