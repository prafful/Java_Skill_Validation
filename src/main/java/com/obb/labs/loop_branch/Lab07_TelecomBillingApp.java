package com.obb.labs.loop_branch;

import com.obb.labs.domain.SubscriptionAccount;

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
        acc.setCustomerName("Asha");
        acc.setPlanCode("PRO");
        acc.setMonthlyFee(499.00);
        acc.setMonthsPaid(14);
        acc.setActive(true);
        // NOTE: Use domain methods (black-box test expects exact output).
        // TODO: compute values using domain methods:
        // subtotal, discountRatePercent, discountAmount, taxPercent, taxAmount, finalTotal
        double subtotal=acc.calculateSubTotal();
        double discountRatePercent=acc.loyaltyDiscountRate();
        double discountAmount=acc.calculateDiscountAmount();
        double taxPercent=acc.taxRate();
        double taxAmount=acc.calculateTaxAmount();
        double finalTotal=acc.calculateFinalTotal();

        // TODO: print EXACT report output matching the contract.
        // Formatting requirements:
        // - Use 2 decimals for money
        // - Loyalty% and Tax% should be whole numbers (10, 18)
        // - Print "First 3 due amounts:" then print Month 1..3 lines using a loop
        // - Each due amount = finalTotal / monthsPaid (2 decimals)
        // - Use a loop and stop after 3 months (break after 3)
        System.out.println("=== OBB Telecom Bill ===");
        System.out.printf("Customer : %s\n", acc.getCustomerName());
        System.out.printf("Plan     : %s\n", acc.getPlanCode());
        System.out.printf("Months   : %d\n", acc.getMonthsPaid());
        System.out.printf("BaseFee  : %.2f\n", acc.getMonthlyFee());
        System.out.printf("Loyalty%% : %.0f\n", acc.loyaltyDiscountRate()*100);
        System.out.printf("Tax%%     : %.0f\n", acc.taxRate()*100);
        System.out.println("--------------------------------");
        System.out.printf("SubTotal : %.2f\n", subtotal);
        System.out.printf("Discount : %.2f\n", discountAmount);
        System.out.printf("Tax      : %.2f\n", taxAmount);
        System.out.printf("Total    : %.2f\n", finalTotal);
        System.out.println("--------------------------------");
        System.out.printf("Status   : %s\n", acc.isActive() ? "ACTIVE" : "INACTIVE");
        System.out.println("First 3 due amounts:");
        for (int month = 1; month <= 3; month++) {
            double dueAmount = finalTotal / acc.getMonthsPaid();
            System.out.printf("Month %d  : %.2f\n", month, dueAmount);
            if (month == 3) break;
        }
        // TIP: Use System.out.printf for aligned formatting.
    }
}
