package com.obb.labs.domain;

/**
 * Account class for the lab.
 *
 */

public class Account {


    // TODO 2: Create private properties:
     private double balance;
     private String name;

    // TODO 3: Generate / write getters and setters for balance and name
     public double getBalance() { return balance; }
     public void setBalance(double balance) { this.balance = balance; }
     public String getName() { return name; }
     public void setName(String name) { this.name = name; }

    // TODO 4: Implement addInterest():
    // Increase the balance by 10% (balance = balance * 1.10)
     public void addInterest() { balance = balance*1.10; }

//    private double balance;
//    private String name;

//    public double getBalance() {
//        return balance;
//    }
//
//    public void setBalance(double balance) {
//        this.balance = balance;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

//    public void addInterest() {
//        balance = balance * 1.10;
//    }
}
