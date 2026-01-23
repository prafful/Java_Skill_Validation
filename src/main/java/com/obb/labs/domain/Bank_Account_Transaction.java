package com.obb.labs.domain;

public class Bank_Account_Transaction {
    private String name;
    private double balance;

    // TODO-1: Declare and initialize a static interestRate (double).
    // Example: private static double interestRate = 0.10;
    private static double interestRate = 0.10;

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        Bank_Account_Transaction.interestRate = interestRate;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    // TODO-2: Create a constructor Account(String name, double balance)
    //         Assign parameters to instance variables.

    public Bank_Account_Transaction(String name,double balance) {
        this.name = name;
        this.balance=balance;
    }

    // TODO-3: Create a no-arg constructor that calls the 2-arg constructor using this(...)
    //         Use your first name and a balance of 50.

    public Bank_Account_Transaction() {
        this.name = "Archit";
        this.balance=50;
    }




    public void addInterest() {
        // TODO-7: Modify this to use interestRate (NOT a fixed 1.10).
         balance = balance * (1 + interestRate);
    }

    public boolean withdraw(double amount) {
        // TODO-8: Implement withdrawal rule:
        // If balance >= amount, subtract and return true; else return false.
        if(balance>=amount){
            balance-=amount;
            return true;
        }
        return false;
    }

    public boolean withdraw() {
        // TODO-9: Overloaded withdraw() that deducts 20 (no params).
       withdraw(20);
        return false;
    }


}
