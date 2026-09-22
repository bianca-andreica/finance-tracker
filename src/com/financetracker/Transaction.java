package com.financetracker;

import java.time.LocalDate;

public class Transaction {
    private int amount;
    private TransactionType type;
    private CategoryType category;
    private LocalDate date;
    private Account account;
    private String description;
    public Transaction(int amount,TransactionType type,CategoryType category,Account account,String description)
    {
        this.amount=amount;
        this.type=type;
        this.category=category;
        this.date=LocalDate.now();
        this.account=account;
        this.description=description;
    }
    public Transaction(int amount,TransactionType type,CategoryType category,LocalDate date,Account account,String description)
    {
        this.amount=amount;
        this.type=type;
        this.category=category;
        this.date=date;
        this.account=account;
        this.description=description;
    }
    public int getAmount()
    {
        return this.amount;
    }
    public TransactionType getType()
    {
        return this.type;
    }
    public CategoryType getCategory()
    {
        return this.category;
    }
    public LocalDate getDate()
    {
        return this.date;
    }
    public Account getAccount()
    {
        return this.account;
    }
    public String getDescription()
    {
        return this.description;
    }
}
