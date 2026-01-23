package com.obb.labs.domain;


public class ForexCurrentAccount extends ForexAccount {

    public ForexCurrentAccount(String name, double balance) {
        super(name, balance);
    }

    @Override
    public void addInterest() {
        // TODO: Current accounts get 2% interest
        // balance = balance * 1.02;
    }
}
