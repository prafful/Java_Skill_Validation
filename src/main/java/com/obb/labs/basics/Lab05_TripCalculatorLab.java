package com.obb.labs.basics;

/**
 * Lab: Chapter 3 - Java Basics (Variables, Operators, Casting, Conditionals, Loops)
 *
 * Scenario:
 * You are building a console "Trip Calculator" for a car dashboard.
 * You will print car details, compute trip time, fuel usage, and a status label.
 *
 * Student rules:
 * - Only edit TODO sections.
 * - Do NOT rewrite the program.
 * - Output must match the contract exactly (same text, spacing, line order).
 */
public class Lab05_TripCalculatorLab {

    public static void main(String[] args) {

        // --------------------------------------------
        // GIVEN values (do not change these constants)
        // --------------------------------------------
        final String makeConst = "TATA";
        final String modelConst = "NexonEV";
        final double batteryKWhConst = 30.5;    // kWh
        final byte gearConst = 3;              // simulated gear
        final short tripKmConst = 74;          // km
        final double avgSpeedKmphConst = 52.0; // km/h
        final double efficiencyKmPerKWhConst = 6.2; // km per kWh

        // ==========================================================
        // TODO 1: Declare variables (same types as hinted)
        // ==========================================================
        // Declare:
        //   String make, model
        //   double batteryKWh
        //   byte gear
        //   short tripKm
        //   double avgSpeedKmph
        //   double efficiencyKmPerKWh
        //
        // TODO 1: declare here


        // ==========================================================
        // TODO 2: Initialize variables using the given constants
        // ==========================================================
        // Make sure you copy values from the constants above.
        //
        // TODO 2: initialize here


        // ==========================================================
        // TODO 3: Compute estimated time in minutes (casting required)
        // ==========================================================
        // Formula:
        //   hours = tripKm / avgSpeedKmph
        //   minutes = hours * 60
        //
        // Requirement:
        // - store minutes in an int called estMinutes
        // - cast so it compiles
        //
        // TODO 3: compute estMinutes


        // ==========================================================
        // TODO 4: Compute energyUsedKWh (double) and remainingKWh (double)
        // ==========================================================
        // energyUsedKWh = tripKm / efficiencyKmPerKWh
        // remainingKWh  = batteryKWh - energyUsedKWh
        //
        // TODO 4: compute energyUsedKWh and remainingKWh


        // ==========================================================
        // TODO 5: Decide rangeStatus (String) using if/else
        // ==========================================================
        // If remainingKWh >= 10.0  -> "SAFE"
        // else if remainingKWh >= 3.0 -> "LOW"
        // else -> "CRITICAL"
        //
        // TODO 5: compute rangeStatus


        // ==========================================================
        // TODO 6: Print output contract EXACTLY (line order matters)
        // ==========================================================
        // IMPORTANT: Formatting rules to keep it Chapter-3 friendly:
        // - For energyUsedKWh and remainingKWh: print with ONE decimal place
        //   You MUST use: (double) ((int)(value * 10)) / 10
        //   (This truncates to 1 decimal without any advanced formatting APIs)
        //
        // Print EXACTLY:
        // Car: TATA NexonEV
        // Gear: 3
        // Trip (km): 74
        // Avg speed (km/h): 52.0
        // Est time (min): 85
        // Energy used (kWh): 11.9
        // Remaining (kWh): 18.5
        // Status: SAFE
        //
        // TODO 6: print all lines


        // ==========================================================
        // TODO 7: Mini loop summary (simple for-loop)
        // ==========================================================
        // Print exactly 3 lines for gears 1..3:
        // Gear 1 speed=20
        // Gear 2 speed=40
        // Gear 3 speed=60
        //
        // speed is short, computed as (short)(g * 20)
        //
        // TODO 7: loop and print




    }
}
