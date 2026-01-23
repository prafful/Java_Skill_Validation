package com.obb.labs.lambdas;

import com.obb.labs.domain.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * Orchestration layer (prints output)
 * - Uses domain object Order
 * - Demonstrates multiple lambdas
 */
public class Lab16_LambdaLabApp {

    public static void main(String[] args) {

        // TODO 1: Create a Detailable lambda that returns "hello world"
        // Example: Detailable det = () -> { return "hello world"; };

        // TODO 2: Print: HELLO : <det.getDetails()>

        // Create an order
        Order o = new Order("OBB-1001", 1000.0, "VIP");

        // TODO 3: Create a PricingRule lambda:
        // If customerType is "VIP" => 10% off, else no discount
        // Apply it using o.applyRule(rule)

        // TODO 4: Print the billing lines EXACTLY as per the output contract:
        // ORDER : <id>
        // AMOUNT: <amount to 2 decimals>
        // RULE  : VIP 10% OFF
        // FINAL : <finalAmount to 2 decimals>
        // TAX   : <tax to 2 decimals>
        // TOTAL : <total to 2 decimals>

        // Lambda example: print items 1..5 on one line
        List<Integer> items = new ArrayList<>();
        for (int i = 1; i <= 5; i++) items.add(i);

        // TODO 5: Use a lambda (forEach) to build this EXACT line:
        // ITEMS : 1 2 3 4 5

        // Lambda example: map 1..3 to squares
        Function<Integer, Integer> square = null; // TODO 6: assign lambda x -> x * x

        // TODO 7: Print EXACT line:
        // MAP   : 1->1 2->4 3->9
    }
}
