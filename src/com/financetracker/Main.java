package com.financetracker;

public class Main {
    public static void main(String[] args) {
        Account account = new Account("revolut", AccountType.BANK, Currency.RON, 10);
        System.out.println(account.getName());
        account.deposit(10);
        System.out.println(account.getBalance());
        account.withdraw(10);
        System.out.println(account.getBalance());
    }
}