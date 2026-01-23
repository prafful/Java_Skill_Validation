package com.obb.labs.domain;

public class Bank_Account_Transaction {
    private String name;
    private double balance;

    // TODO-1: Declare and initialize a static interestRate (double).
    // Example: private static double interestRate = 0.10;
    private static double interestRate = 0.10;

    // TODO-2: Create a constructor Account(String name, double balance)
    //         Assign parameters to instance variables.
    public Bank_Account_Transaction(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    // TODO-3: Create a no-arg constructor that calls the 2-arg constructor using this(...)
    //         Use your first name and a balance of 50.
    public Bank_Account_Transaction() {
        this("YourFirstName", 50.0);  // Replace "YourFirstName" with your actual first name
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // TODO-4: set the instance variable
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        // TODO-5: set the instance variable
        this.balance = balance;
    }

    // TODO-6: Create static getter and setter for interestRate:
    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double rate) {
        interestRate = rate;
    }

    public void addInterest() {
        // TODO-7: Modify this to use interestRate (NOT a fixed 1.10).
        balance = balance * (1 + interestRate);  // Applying the interest rate to the balance
    }

    public boolean withdraw(double amount) {
        // TODO-8: Implement withdrawal rule:
        // If balance >= amount, subtract and return true; else return false.
        if (balance >= amount) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    public boolean withdraw() {
        // TODO-9: Overloaded withdraw() that deducts 20 (no params).
        // HINT: Call withdraw(20) to avoid duplicate logic.
        return withdraw(20);  // Calls the withdraw method with 20 as the amount
    }
}
