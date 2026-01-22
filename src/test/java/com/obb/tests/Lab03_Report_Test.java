package com.obb.tests;

import com.obb.labs.introduction.Lab03_Report;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Lab03_Report_Test {

    public static void main(String[] args) {

        String expected ="Name    : Alice\n" +
                        "Age     : 25\n" +
                        "Salary  : 50000\n" +
                        "----------------\n" +
                        "Status  : ACTIVE";

        PrintStream originalOut = System.out;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        System.setOut(new PrintStream(buffer));

        try {
            Lab03_Report.main(new String[0]);
        } finally {
            System.setOut(originalOut);
        }

        String actual = buffer.toString()
                .replace("\r\n", "\n")
                .replace("\r", "\n")
                .trim();

        System.out.println("=== Lab03 Test ===");
        System.out.println("Expected:");
        System.out.println(expected);
        System.out.println("Actual:");
        System.out.println(actual);

        if (expected.equals(actual)) {
            System.out.println("RESULT : PASS");
            System.exit(0);
        } else {
            System.out.println("RESULT : FAIL");
            System.exit(1);
        }
    }
}
