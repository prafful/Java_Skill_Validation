package com.obb.tests;

import com.obb.labs.introduction.Lab02_PrintPatterns;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Lab02_PrintPatterns_Test {

    public static void main(String[] args) {

        String expected =
                "Java\n" +
                        "is\n" +
                        "fun!";

        PrintStream originalOut = System.out;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        System.setOut(new PrintStream(buffer));

        try {
            Lab02_PrintPatterns.main(new String[0]);
        } finally {
            System.setOut(originalOut);
        }

        String actual = buffer.toString().trim();

        System.out.println("=== Lab02 Test ===");
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
