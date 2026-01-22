package com.obb.tests;

import com.obb.labs.basics.Lab04_MyFirstClass;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Lab04_MyFirstClass_Test {

    public static void main(String[] args) {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream capture = new PrintStream(baos);

        try {
            System.setOut(capture);

            // Execute student's code
            Lab04_MyFirstClass.main(new String[0]);

        } catch (Throwable t) {
            // Restore stdout before reporting
            System.setOut(originalOut);
            System.out.println("RESULT : FAIL");
            System.exit(1);
            return;
        } finally {
            System.out.flush();
            System.setOut(originalOut);
        }

        String actual = baos.toString();
        String normalizedActual = actual.replace("\r\n", "\n").replace("\r", "\n").trim();

        String expected =
                "The make is BMW\n" +
                        "The model is 530D\n" +
                        "The engine size is 3.0\n" +
                        "The gear is 2\n" +
                        "The speed is 40\n" +
                        "The revs is 80";

        String normalizedExpected = expected.replace("\r\n", "\n").replace("\r", "\n").trim();

        if (normalizedActual.equals(normalizedExpected)) {
            System.out.println("RESULT : PASS");
            System.exit(0);
        } else {
            // Keep stdout clean: only PASS/FAIL is required.
            // Diagnostics go to stderr (optional but helpful for trainers).
            System.err.println("---- EXPECTED ----");
            System.err.println(normalizedExpected);
            System.err.println("---- ACTUAL ----");
            System.err.println(normalizedActual);

            System.out.println("RESULT : FAIL");
            System.exit(1);
        }
    }
}
