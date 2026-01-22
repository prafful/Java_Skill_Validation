package com.obb.labs.arrays;

import com.obb.labs.domain.Bank_Account;

/**
 * Application/orchestration:
 * - Creates arrays
 * - Populates Account[]
 * - Prints BEFORE and AFTER interest
 */

public class Lab08_AccountArrayApp {

    public static void main(String[] args) {

        // 1) Declare and initialize array of Accounts (size 5)
        Bank_Account[] arrayOfAccounts = new Bank_Account[5]; // TODO: keep size 5 (already correct)

        // 2) Predefined data arrays (keep values exactly as-is)
        double[] amounts = {23, 5444, 2, 345, 34};
        String[] names = {"Picard", "Ryker", "Worf", "Troy", "Data"};

        // Header
        System.out.println("=== ACCOUNTS REPORT ===");
        System.out.println("COUNT : " + arrayOfAccounts.length);
        System.out.println("-----------------------");

        // 3) Populate arrayOfAccounts using a for loop
        for (int i = 0; i < arrayOfAccounts.length; i++) {

            // TODO: create an Account using names[i] and amounts[i]
            // TODO: assign it into arrayOfAccounts[i]

            // 4) Print name and balance (BEFORE interest) in the exact format:
            // BEFORE : <Name> | <Balance to 2 decimals>

            // 5) Call addInterest() and print AFTER interest in exact format:
            // AFTER  : <Name> | <Balance to 2 decimals>

            // Print separator line:
            // -----------------------
        }

        // Footer
        System.out.println("=== END ===");
    }

}
