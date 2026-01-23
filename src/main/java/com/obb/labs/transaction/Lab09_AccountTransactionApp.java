package com.obb.labs.transaction;

import com.obb.labs.domain.Bank_Account_Transaction;

public class Lab09_AccountTransactionApp {

    public static void main(String[] args) {

        // TODO-1: Create an array of 5 Account objects using the (name, balance) constructor.
        // Use EXACT data below to match the output contract:
        // Alice  100
        // Bob     50
        // Chitra 200
        // Dev     20
        // Esha   75.5

        Bank_Account_Transaction[] accounts = null;

        // TODO-2: Set interest rate to 0.05 using the Account static setter.
        // Account.setInterestRate(0.05);

        System.out.println("Interest Rate: " + String.format("%.2f", /* TODO-3: read interest rate */ 0.0));
        System.out.println("----------------");

        // TODO-4: Loop through accounts and print EXACTLY the contract format:
        // For each account:
        // Account: <name>
        // Balance before: <balance 2 decimals>
        // Balance after : <balance 2 decimals>  (after addInterest)
        // Withdraw 20? : <true/false>           (call withdraw())
        // Balance now   : <balance 2 decimals>
        // Withdraw X? : <true/false>            (use these exact per-person amounts)
        // Balance now   : <balance 2 decimals>
        // ----------------
        //
        // Use these X values:
        // Alice  -> 90
        // Bob    -> 40
        // Chitra -> 150
        // Dev    -> 5
        // Esha   -> 60
    }

}
