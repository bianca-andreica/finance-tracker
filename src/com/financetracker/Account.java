package com.financetracker;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private String name;
    private AccountType type;
    private Currency currency;
    private int balance;
    private List<Transaction> listTransactions;
    public Account(String name,AccountType type,Currency currency,int balance)
    {
        this.name=name;
        this.type=type;
        this.currency=currency;
        this.balance=balance;
    }
    public String getName()
    {
        return this.name;
    }
    public AccountType getType()
    {
        return this.type;
    }
    public Currency getCurrency()
    {
        return this.currency;
    }
    public int getBalance()
    {
        return this.balance;
    }
    public void deposit(int deposit)
    {
        this.balance=this.balance+deposit;
    }
    public void withdraw(int withdrawn_amount)
    {
        this.balance=this.balance-withdrawn_amount;
    }
}
