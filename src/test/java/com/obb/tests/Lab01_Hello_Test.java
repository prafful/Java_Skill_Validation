package com.obb.tests;

import com.obb.labs.introduction.Lab01_Hello;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Lab01_Hello_Test {

    public static void main(String[] args) {
        String expected = "Hello, Java Learner!";

        // Capture System.out
        PrintStream originalOut = System.out;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        System.setOut(new PrintStream(buffer));

        try {
            Lab01_Hello.main(new String[0]);
        } finally {
            System.setOut(originalOut); // restore
        }

        String actual = buffer.toString().trim();

        System.out.println("=== Lab01 Test ===");
        System.out.println("Expected: " + expected);
        System.out.println("Actual  : " + actual);

        if (expected.equals(actual)) {
            System.out.println("RESULT  : PASS");
            System.exit(0);
        } else {
            System.out.println("RESULT  : FAIL");
            System.exit(1);
        }
    }
}
