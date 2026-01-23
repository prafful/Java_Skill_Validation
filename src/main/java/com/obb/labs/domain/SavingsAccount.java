package com.obb.labs.domain;

public class SavingsAccount extends InheritAccount {

    public SavingsAccount(String name, double balance) {
        super(name, balance);
        // TODO 5: nothing else needed here
    }

    @Override
    public void addInterest() {
        // TODO 6:
        // Multiply balance by 1.4 using getBalance() and setBalance()
    }
}
