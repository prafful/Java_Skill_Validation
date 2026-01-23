package com.obb.tests;

import com.obb.labs.classes_package.Lab10_Packages_Bank_Summary;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Lab10_Packages_Bank_Summary_Test {

    public static void main(String[] args) {

        String expected =
                "BANK SUMMARY\n" +
                        "----------------\n" +
                        "A001 | Anita | SAVINGS | 10368.78\n" +
                        "A002 | Ravi | CURRENT | 4750.00\n" +
                        "TOTAL BALANCE : 15118.78\n" +
                        "RICH ACCOUNTS : 1";

        PrintStream originalOut = System.out;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        System.setOut(new PrintStream(buffer));

        try {
            Lab10_Packages_Bank_Summary.main(new String[0]);
        } catch (Exception e) {
            // Any exception = FAIL
        } finally {
            System.setOut(originalOut);
        }

        String actual = buffer.toString()
                .replace("\r\n", "\n")
                .replace("\r", "\n")
                .trim();

        String exp = expected
                .replace("\r\n", "\n")
                .replace("\r", "\n")
                .trim();

        if (actual.equals(exp)) {
            System.out.println("RESULT : PASS");
            System.exit(0);
        } else {
            System.out.println("RESULT : FAIL");
            System.exit(1);
        }
    }
}
