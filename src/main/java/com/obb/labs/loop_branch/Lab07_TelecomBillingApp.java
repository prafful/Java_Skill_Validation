package com.obb.labs.loop_branch;

import com.obb.domain.SubscriptionAccount;

/**
 * Application / orchestration.
 * Prints a billing report in an exact format required by the test contract.
 */
public class Lab07_TelecomBillingApp {

    public static void main(String[] args) {

        SubscriptionAccount acc = new SubscriptionAccount();

        // TODO: set customerName = "Asha"
        // TODO: set planCode     = "PRO"
        // TODO: set monthlyFee   = 499.00
        // TODO: set monthsPaid   = 14
        // TODO: set active       = true

        // NOTE: Use domain methods (black-box test expects exact output).
        // TODO: compute values using domain methods:
        // subtotal, discountRatePercent, discountAmount, taxPercent, taxAmount, finalTotal

        // TODO: print EXACT report output matching the contract.
        // Formatting requirements:
        // - Use 2 decimals for money
        // - Loyalty% and Tax% should be whole numbers (10, 18)
        // - Print "First 3 due amounts:" then print Month 1..3 lines using a loop
        // - Each due amount = finalTotal / monthsPaid (2 decimals)
        // - Use a loop and stop after 3 months (break after 3)

        // TIP: Use System.out.printf for aligned formatting.
    }
}
