package com.obb.labs.domain;

public class Bank_Account_Transaction {
    private String name;
    private double balance;

    // TODO-1: Declare and initialize a static interestRate (double).
    // Example: private static double interestRate = 0.10;

    // TODO-2: Create a constructor Account(String name, double balance)
    //         Assign parameters to instance variables.

    // TODO-3: Create a no-arg constructor that calls the 2-arg constructor using this(...)
    //         Use your first name and a balance of 50.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // TODO-4: set the instance variable
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        // TODO-5: set the instance variable
    }

    // TODO-6: Create static getter and setter for interestRate:
    // public static double getInterestRate() { ... }
    // public static void setInterestRate(double rate) { ... }

    public void addInterest() {
        // TODO-7: Modify this to use interestRate (NOT a fixed 1.10).
        // balance = balance * (1 + interestRate);
    }

    public boolean withdraw(double amount) {
        // TODO-8: Implement withdrawal rule:
        // If balance >= amount, subtract and return true; else return false.
        return false;
    }

    public boolean withdraw() {
        // TODO-9: Overloaded withdraw() that deducts 20 (no params).
        // HINT: Call withdraw(20) to avoid duplicate logic.
        return false;
    }


}
