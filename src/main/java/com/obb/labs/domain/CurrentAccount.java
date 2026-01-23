package com.obb.labs.domain;

public class CurrentAccount extends InheritAccount {

    public CurrentAccount(String name, double balance) {
        super(name, balance);
        // TODO 7: nothing else needed here
    }

    @Override
    public void addInterest() {
        // TODO 8:
        // Multiply balance by 1.1 using getBalance() and setBalance()
    }
}