package com.jumaben.bankingsystem;

import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to the Banking System");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. View Account");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter account number: ");
                    String accountNumber = scanner.next();
                    System.out.print("Enter account holder name: ");
                    String accountHolderName = scanner.next();
                    System.out.print("Enter initial balance: ");
                    double initialBalance = scanner.nextDouble();
                    Account newAccount = new Account(accountNumber, accountHolderName, initialBalance);
                    bank.addAccount(newAccount);
                    System.out.println("Account created successfully.");
                    break;
                case 2:
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.next();
                    Account account = bank.findAccount(accountNumber);
                    if (account != null) {
                        System.out.print("Enter deposit amount: ");
                        double amount = scanner.nextDouble();
                        account.deposit(amount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.next();
                    account = bank.findAccount(accountNumber);
                    if (account != null) {
                        System.out.print("Enter withdrawal amount: ");
                        double amount = scanner.nextDouble();
                        account.withdraw(amount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.next();
                    account = bank.findAccount(accountNumber);
                    if (account != null) {
                        System.out.println("Account Number: " + account.getAccountNumber());
                        System.out.println("Account Holder: " + account.getAccountHolderName());
                        System.out.println("Balance: " + account.getBalance());
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 5:
                    System.out.println("Thank you for using the Banking System!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
