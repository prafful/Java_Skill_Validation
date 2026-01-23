package com.obb.labs.domain;


/**
 * Business Entity: Order
 * - Pure domain object (NO main(), NO printing)
 * - Lambdas plug into business rules (PricingRule, Detailable)
 */
public class Order {

    private String orderId;
    private double amount;
    private String customerType;

    // Derived values after rule + tax
    private double finalAmount;
    private double taxRate; // e.g., 0.18 for 18%

    public Order() {
        // sensible defaults
        this.taxRate = 0.18;
    }

    public Order(String orderId, double amount, String customerType) {
        this();
        this.orderId = orderId;
        this.amount = amount;
        this.customerType = customerType;
        this.finalAmount = amount;
    }

    // Getters / Setters
    public String getOrderId() { return orderId; }
    public void setOrderId(String orderId) { this.orderId = orderId; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public String getCustomerType() { return customerType; }
    public void setCustomerType(String customerType) { this.customerType = customerType; }

    public double getFinalAmount() { return finalAmount; }
    public void setFinalAmount(double finalAmount) { this.finalAmount = finalAmount; }

    public double getTaxRate() { return taxRate; }
    public void setTaxRate(double taxRate) { this.taxRate = taxRate; }

    // Business Methods

    /**
     * Apply a pricing rule (lambda) to compute finalAmount.
     * Rule receives the current order and returns the discounted amount.
     */
    public void applyRule(PricingRule rule) {
        // TODO: set finalAmount using rule.apply(this)
        // Hint: finalAmount should be whatever the rule returns.
    }

    /**
     * Compute tax based on finalAmount and taxRate.
     */
    public double computeTax() {
        // TODO: return finalAmount * taxRate
        return 0.0;
    }

    /**
     * Compute total = finalAmount + tax
     */
    public double computeTotal() {
        // TODO: return finalAmount + computeTax()
        return 0.0;
    }
}

/**
 * Functional interface for pricing rules.
 * Example: VIP 10% OFF
 */
@FunctionalInterface
interface PricingRule {
    double apply(Order order);
}

/**
 * Tiny functional interface for first lambda demo.
 */
@FunctionalInterface
interface Detailable {
    String getDetails();
}
