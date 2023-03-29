package com.tekion.bank;

import java.util.ArrayList;

public class Account {
    private String name;
    private int balance;
    private ArrayList<Integer> transactions;

    public Account(String name) {
        this.name = name;
        this.transactions = new ArrayList<>();
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if(amount > 0) {
            transactions.add(amount);
            this.balance += amount;
            System.out.println(amount + " deposited. Your current balance is :" + this.balance);
        }
        else {
            System.out.println("Cannot deposit..");
        }
    }

    public void withdraw(int amount) {
        int withd = -amount;
        if(withd < 0 && balance >= amount) {
            transactions.add(withd);
            this.balance += withd;
            System.out.println(amount + " withdrawn. Your current balance is " + this.balance);
        }
        else {
            System.out.println("Can't withdraw");
        }
    }

    public void calculateBalance() {
        this.balance = 0;
        for(int i: transactions) {
            this.balance += i;
        }
        System.out.println("Calculated balance " + this.balance);
    }
}
