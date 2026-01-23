package com.obb.labs.domain;

public class ForexSavingsAccount extends ForexAccount {

    public ForexSavingsAccount(String name, double balance) {
        super(name, balance);
    }

    @Override
    public void addInterest() {
        // TODO: Savings accounts get 10% interest
        // balance = balance * 1.10;
    }
}
