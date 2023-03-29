package com.tekion.bank;

public class Main {


    public static void main(String[] args) {
        Account myAcc = new Account("Raj");
        myAcc.deposit(100);
        myAcc.withdraw(200);
        myAcc.calculateBalance();
    }

}
