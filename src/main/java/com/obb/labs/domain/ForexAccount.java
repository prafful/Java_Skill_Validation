package com.obb.labs.domain;

import com.obb.labs.domain.Details;

public abstract class ForexAccount implements Details {

    private double balance;
    private String name;

    public ForexAccount(String name, double balance) {
        // TODO: Initialize fields
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    // Business method (implemented differently by subclasses)
    public abstract void addInterest();

    @Override
    public String getDetails() {
        // TODO: Return exactly in this format:
        // AccountType | Name=<name> | Balance=<balance with 2 decimals>
        // Example:
        // CurrentAccount | Name=Alex | Balance=1020.00
        return "";
    }
}
