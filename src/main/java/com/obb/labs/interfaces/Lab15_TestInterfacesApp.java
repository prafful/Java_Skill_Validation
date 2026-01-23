package com.obb.labs.interfaces;


import com.obb.labs.domain.ForexCurrentAccount;
import com.obb.labs.domain.Details;
import com.obb.labs.domain.TradeInsurance;
import com.obb.labs.domain.ForexSavingsAccount;

public class Lab15_TestInterfacesApp {

    public static void main(String[] args) {

        // Create products
        ForexCurrentAccount ca = new ForexCurrentAccount("Alex", 1000.00);
        ForexSavingsAccount sa = new ForexSavingsAccount("Beena", 2000.00);
        TradeInsurance hi = new TradeInsurance("Chitra", 500.00, 250.00, 1000000.00);

        // Apply account business rule (interest)
        // TODO: Call addInterest() on ca and sa

        // Put all products into a Detailable array
        // TODO: Create Details[] products with 3 elements and store ca, sa, hi

        // Print details in order
        // TODO: Loop and print each getDetails() on its own line
    }
}
