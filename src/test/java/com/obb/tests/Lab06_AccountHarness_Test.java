package com.obb.tests;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Lab06_AccountHarness_Test {

    public static void main(String[] args) {

        PrintStream originalOut = System.out;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));

        try {
            com.obb.labs.objects.Lab06_TestAccount.main(new String[0]);
        } catch (Exception e) {
            System.setOut(originalOut);
            System.out.println("RESULT : FAIL");
            System.exit(1);
        }

        System.setOut(originalOut);

        String actual = baos.toString()
                .replace("\r\n", "\n")
                .replace("\r", "\n")
                .trim();

        String expected =
                "Name : OBB Student\n" +
                        "Balance : 1000.00\n" +
                        "Balance after interest : 1100.00";

        if (actual.equals(expected)) {
            System.out.println("RESULT : PASS");
            System.exit(0);
        } else {
            System.out.println("RESULT : FAIL");
            System.exit(1);
        }
    }
}
