package com.obb.labs.classes_package;


import com.obb.labs.domain.MyBank;

public class Lab10_Packages_Bank_Summary {

    public static void main(String[] args) {

        // GIVEN: Two accounts
        MyBank a1 = new MyBank("A001", "Anita", "SAVINGS", 10000.00);
        MyBank a2 = new MyBank("A002", "Ravi",  "CURRENT", 5000.00);

        // Transactions (must stay exactly this order)
        // TODO 1: a1 deposit 500
        // TODO 2: a1 withdraw 200
        // TODO 3: a2 withdraw 200
        // TODO 4: applyMonthlyUpdate() for BOTH accounts for 2 months (loop exactly 2 times)

        // Reporting
        // Output contract must match EXACTLY (spacing + punctuation)
        System.out.println("BANK SUMMARY");
        System.out.println("----------------");

        // TODO 5: Print account lines in this exact format:
        // <accountNo> | <holderName> | <type> | <balance with 2 decimals>
        // Example:
        // A001 | Anita | SAVINGS | 10368.78

        // TODO 6: Print TOTAL BALANCE with 2 decimals
        // TODO 7: Print RICH ACCOUNTS count (balance >= 10000)

        // Hints:
        // - Use String.format("%.2f", value) for 2 decimals
        // - Compute total using getters
    }
}




