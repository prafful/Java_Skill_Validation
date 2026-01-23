package com.obb.tests;

import com.obb.labs.inheritance.Lab14_TestInheritance;
import com.obb.labs.inheritance.Lab14_TestInheritance;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Lab14_TestInheritance_Test {

    public static void main(String[] args) {

        String expected =
                "=== Account Interest Report ===\n" +
                        "1) SAVINGS | Name: Alice | Balance: 5.60\n" +
                        "2) CURRENT | Name: Bob   | Balance: 6.60\n" +
                        "3) SAVINGS | Name: Chen  | Balance: 8.40";

        PrintStream originalOut = System.out;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        System.setOut(new PrintStream(buffer));

        try {
            Lab14_TestInheritance.main(new String[0]);
        } catch (Exception e) {
            // swallow; we'll fail by mismatch
        } finally {
            System.setOut(originalOut);
        }

        String actual = buffer.toString()
                .replace("\r\n", "\n")
                .replace("\r", "\n")
                .trim();

        String expNorm = expected
                .replace("\r\n", "\n")
                .replace("\r", "\n")
                .trim();

        if (actual.equals(expNorm)) {
            System.out.print("RESULT : PASS");
            System.exit(0);
        } else {
            System.out.print("RESULT : FAIL");
            System.exit(1);
        }
    }
}
