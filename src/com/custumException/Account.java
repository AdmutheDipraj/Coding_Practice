package com.custumException;

public class Account {

    private int balance=300;

    public int balance(){
        return balance;
    }
    public void withdrowlBalance(int amount){
        if (amount>balance){
            throw new InsufficientFundException("Insufficient Funds");

        }
        balance=balance-amount;
    }
}
