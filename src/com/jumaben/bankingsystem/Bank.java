package com.jumaben.bankingsystem;

import java.util.ArrayList;


public class Bank {
    private ArrayList<Account> accounts;

    public Bank() {

        accounts = new ArrayList<>();
    }

    // Add Account
    public void addAccount(Account account) {

        accounts.add(account);
    }

    // Find Account
    public Account findAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null; // Account not found
    }
}


