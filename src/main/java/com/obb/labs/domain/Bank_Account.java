package com.obb.labs.domain;

/**
 * Domain object: Bank account.
 * Rules:
 * - No main() here
 * - No printing here
 */
public class Bank_Account {

    private String name;
    private double balance;

    public Bank_Account() {
        // TODO: leave as-is (default constructor required)
    }

    public Bank_Account(String name, double balance) {
        // TODO: assign fields (name, balance)
    }

    public String getName() {
        // TODO: return name
        return null;
    }

    public void setName(String name) {
        // TODO: set name
    }

    public double getBalance() {
        // TODO: return balance
        return 0;
    }

    public void setBalance(double balance) {
        // TODO: set balance
    }

    /**
     * Business rule:
     * Add 10% interest to the balance.
     * Example: 100.0 -> 110.0
     */
    public void addInterest() {
        // TODO: apply 10% interest to balance
    }
}
