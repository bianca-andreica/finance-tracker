package com.financetracker;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name,email;
    private List<Account> accounts;
    public User(String name,String email)
    {
        this.name=name;
        this.email=email;
        this.accounts=new ArrayList<>();
    }
    public String getName()
    {
        return this.name;
    }
    public String getEmail()
    {
        return this.email;
    }
    public List<Account> getAccounts()
    {
        return this.accounts;
    }
    public void addAccount(Account account) {
        this.accounts.add(account);
    }
    public void removeAccount(Account account) {
        this.accounts.remove(account);
    }
    public void printAccounts(){
        for(int i=0;i<accounts.size();i++)
        {
            System.out.println("Contul " + (i + 1) + ": " +
                    accounts.get(i).getName() +
                    " | Tip: " + accounts.get(i).getType() +
                    " | Sold: " + accounts.get(i).getBalance() + " " + accounts.get(i).getCurrency());
        }
    }
}
