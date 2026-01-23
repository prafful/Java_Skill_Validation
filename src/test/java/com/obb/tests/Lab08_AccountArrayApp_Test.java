package com.obb.tests;

import com.obb.labs.arrays.Lab08_AccountArrayApp;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Lab08_AccountArrayApp_Test {

    public static void main(String[] args) {

        String expected =
                "=== ACCOUNTS REPORT ===\n" +
                        "COUNT : 5\n" +
                        "-----------------------\n" +
                        "BEFORE : Picard | 23.00\n" +
                        "AFTER  : Picard | 25.30\n" +
                        "-----------------------\n" +
                        "BEFORE : Ryker | 5444.00\n" +
                        "AFTER  : Ryker | 5988.40\n" +
                        "-----------------------\n" +
                        "BEFORE : Worf | 2.00\n" +
                        "AFTER  : Worf | 2.20\n" +
                        "-----------------------\n" +
                        "BEFORE : Troy | 345.00\n" +
                        "AFTER  : Troy | 379.50\n" +
                        "-----------------------\n" +
                        "BEFORE : Data | 34.00\n" +
                        "AFTER  : Data | 37.40\n" +
                        "-----------------------\n" +
                        "=== END ===";

        PrintStream originalOut = System.out;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        System.setOut(new PrintStream(buffer));

        try {
            com.obb.labs.arrays.Lab08_AccountArrayApp.main(new String[0]);
        } catch (Exception e) {
            // If the student's code crashes, it's an automatic FAIL.
        } finally {
            System.setOut(originalOut);
        }

        String actual = buffer.toString()
                .replace("\r\n", "\n")
                .replace("\r", "\n")
                .trim();

        expected = expected
                .replace("\r\n", "\n")
                .replace("\r", "\n")
                .trim();

        if (expected.equals(actual)) {
            System.out.println("RESULT : PASS");
            System.exit(0);
        } else {
            System.out.println("RESULT : FAIL");
            System.exit(1);
        }
    }
}