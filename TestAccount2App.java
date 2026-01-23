package com.obb.app;

import com.obb.domain.Account;

public class TestAccount2App {

    public static void main(String[] args) {

        Account[] accounts = new Account[] {
                new Account("Alice", 100),
                new Account("Bob", 50),
                new Account("Chitra", 200),
                new Account("Dev", 20),
                new Account("Esha", 75.5)
        };

        Account.setInterestRate(0.05);

        System.out.println("Interest Rate: " + String.format("%.2f", Account.getInterestRate()));
        System.out.println("----------------");

        for (int i = 0; i < accounts.length; i++) {

            Account a = accounts[i];

            double x;
            if (a.getName().equals("Alice")) x = 90;
            else if (a.getName().equals("Bob")) x = 40;
            else if (a.getName().equals("Chitra")) x = 150;
            else if (a.getName().equals("Dev")) x = 5;
            else x = 60; // Esha

            System.out.println("Account: " + a.getName());
            System.out.println("Balance before: " + String.format("%.2f", a.getBalance()));

            a.addInterest();
            System.out.println("Balance after : " + String.format("%.2f", a.getBalance()));

            boolean w20 = a.withdraw();
            System.out.println("Withdraw 20? : " + w20);
            System.out.println("Balance now   : " + String.format("%.2f", a.getBalance()));

            boolean wx = a.withdraw(x);
            System.out.println("Withdraw " + (int)x + "? : " + wx);
            System.out.println("Balance now   : " + String.format("%.2f", a.getBalance()));

            System.out.println("----------------");
        }
    }
}
