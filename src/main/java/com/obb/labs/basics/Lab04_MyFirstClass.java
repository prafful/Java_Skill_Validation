package com.obb.labs.basics;

/**
 * Lab: Chapter 3 - Java Basics (Variables, Operators, Casting)
 *
 * Scenario:
 * You are building a tiny console output for a car dashboard setup screen.
 * You will declare variables for a car, print them, calculate speed from gear,
 * and print a simple "revs" value.
 *
 * Rules for students:
 * - Only edit the TODO sections.
 * - Do NOT rewrite the program from scratch.
 * - Output must match the contract exactly (same text, same line order).
 */
public class Lab04_MyFirstClass {

    public static void main(String[] args) {

        // =========================
        // TODO 1: Declare variables
        // =========================
        // Declare:
        //   String make
        //   String model
        //   double engineSize
        //   byte gear
        //
        // NOTE: Java is case sensitive.

        // TODO 1: (declare here)


        // ==========================
        // TODO 2: Initialize variables
        // ==========================
        // Initialize with these EXACT values (so the test can verify output):
        //   make = "BMW"
        //   model = "530D"
        //   engineSize = 3.0
        //   gear = 2

        // TODO 2: (initialize here)


        // ==========================
        // TODO 3: Print car details
        // ==========================
        // Print EXACTLY these lines (same spacing/case):
        // The make is BMW
        // The model is 530D
        // The engine size is 3.0
        // The gear is 2
        //
        // Use string concatenation (+)

        // TODO 3: (print here)


        // ==========================
        // TODO 4: Casting + arithmetic
        // ==========================
        // Declare:
        //   short speed
        //
        // Set speed to: gear * 20
        // You MUST cast so it compiles.
        //
        // Then print EXACTLY:
        // The speed is 40

        // TODO 4: (declare speed + calculate using casting + print)


        // ==========================
        // TODO 5 (Optional extra, but REQUIRED in this lab):
        // ==========================
        // Declare an int called revs.
        // Set revs to: speed * gear
        // Print EXACTLY:
        // The revs is 80

        // TODO 5: (declare revs + calculate + print)

        // TODO 1: Declare variables
        String make;
        String model;
        double engineSize;
        byte gear;

        // TODO 2: Initialize variables
        make = "BMW";
        model = "530D";
        engineSize = 3.0;
        gear = 2;

        // TODO 3: Print car details
        System.out.println("The make is " + make);
        System.out.println("The model is " + model);
        System.out.println("The engine size is " + engineSize);
        System.out.println("The gear is " + gear);

        // TODO 4: Casting + arithmetic
        short speed = (short) (gear * 20);
        System.out.println("The speed is " + speed);

        // TODO 5: Revs
        int revs = speed * gear;
        System.out.println("The revs is " + revs);

    }
}
