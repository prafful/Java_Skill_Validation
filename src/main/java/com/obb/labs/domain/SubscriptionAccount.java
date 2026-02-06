package com.obb.labs.domain;

/**
 * Domain object: Telecom subscription account.
 * Rules:
 * - No printing here
 * - No main() here
 */
public class SubscriptionAccount {

    private String customerName;
    private String planCode;     // BASIC / PRO / ULTRA
    private double monthlyFee;
    private int monthsPaid;
    private boolean active;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPlanCode() {
        return planCode;
    }

    public void setPlanCode(String planCode) {
        this.planCode = planCode;
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    public int getMonthsPaid() {
        return monthsPaid;
    }

    public void setMonthsPaid(int monthsPaid) {
        this.monthsPaid = monthsPaid;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    // ---------------- Business Methods ----------------

    /**
     * Returns the human label for the plan using switch/case:
     * BASIC -> Starter
     * PRO   -> Pro Plus
     * ULTRA -> Ultra Max
     * default -> Unknown
     */
    public String getPlanLabel() {
        return switch (planCode) {
            case "BASIC" -> "Starter";
            case "PRO" -> "Pro Plus";
            case "ULTRA" -> "Ultra Max";
            default -> "Unknown";
        };
    }

    /**
     * Subtotal = monthlyFee * monthsPaid
     */
    public double calculateSubTotal() {
        return monthlyFee * monthsPaid;
    }

    /**
     * Loyalty discount rate based on monthsPaid using if/else:
     * - monthsPaid >= 12  -> 0.10 (10%)
     * - monthsPaid >= 6   -> 0.05 (5%)
     * - otherwise         -> 0.00
     */
    public double loyaltyDiscountRate() {
        if (monthsPaid >= 12) {
            return 0.10;  // 10% discount
        } else if (monthsPaid >= 6) {
            return 0.05;  // 5% discount
        } else {
            return 0.00;  // No discount
        }
    }

    /**
     * Discount amount = subtotal * loyaltyDiscountRate
     */
    public double calculateDiscountAmount() {
        // TODO: implement (should call other business methods)
        double subtotal = calculateSubTotal();
        double discountRate = loyaltyDiscountRate();
        return subtotal*discountRate;
    }

    /**
     * Tax rate is fixed at 18% (0.18)
     */
    public double taxRate() {
        return 0.18;
//        return 0;
    }

    /**
     * Tax is applied AFTER discount:
     * taxable = subtotal - discount
     * tax = taxable * taxRate
     */
    public double calculateTaxAmount() {
        // TODO: implement using methods above
        double subtotal = calculateSubTotal();
        double discountAmount = calculateDiscountAmount();
        double taxable = subtotal - discountAmount;
        return taxable * taxRate();
    }

    /**
     * Final total:
     * total = (subtotal - discount) + tax
     */
    public double calculateFinalTotal() {
        // TODO: implement
        double subtotal = calculateSubTotal();
        double discountAmount = calculateDiscountAmount();
        double taxAmount = calculateTaxAmount();
        return (subtotal - discountAmount) + taxAmount;
    }

    /**
     * ACTIVE -> "ACTIVE"
     * otherwise -> "SUSPENDED"
     */
    public String statusLabel() {
        // TODO: implement using if/else
        if (active){
            return "ACTIVE";
        }else {
            return "SUSPENDED";
        }
    }
}
