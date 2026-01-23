package com.obb.labs.domain;


public class TradeInsurance implements Details {

    private double premium;
    private double excess;
    private double amountInsured;
    private String name;

    public TradeInsurance(String name, double premium, double excess, double amountInsured) {
        // TODO: Initialize fields
    }

    public double getPremium() {
        return premium;
    }

    public double getExcess() {
        return excess;
    }

    public double getAmountInsured() {
        return amountInsured;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getDetails() {
        // TODO: Return exactly in this format (2 decimals for numbers):
        // TradeInsurance | Name=<name> | Premium=<premium> | Excess=<excess> | AmountInsured=<amountInsured>
        // Example:
        // TradeInsurance | Name=Chitra | Premium=500.00 | Excess=250.00 | AmountInsured=1000000.00
        return "";
    }
}
