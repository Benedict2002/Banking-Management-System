package com.jumaben.bankingsystem;

import java.util.ArrayList;

// Account Class
public class Account {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor
    public Account(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    // Getters and Setters
    public String getAccountNumber() { return accountNumber; }
    public String getAccountHolderName() { return accountHolderName; }
    public double getBalance() { return balance; }

    // Deposit Method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw Method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
}


