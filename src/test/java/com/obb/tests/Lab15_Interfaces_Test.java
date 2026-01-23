package com.obb.tests;


import com.obb.labs.interfaces.Lab15_TestInterfacesApp;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Lab15_Interfaces_Test {

    public static void main(String[] args) {

        String expected =
                "CurrentAccount | Name=Alex | Balance=1020.00\n" +
                        "SavingsAccount | Name=Beena | Balance=2200.00\n" +
                        "HomeInsurance | Name=Chitra | Premium=500.00 | Excess=250.00 | AmountInsured=1000000.00";

        PrintStream originalOut = System.out;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        System.setOut(new PrintStream(buffer));

        try {
            Lab15_TestInterfacesApp.main(new String[0]);
        } catch (Throwable t) {
            System.setOut(originalOut);
            System.out.println("RESULT : FAIL");
            System.exit(1);
            return;
        } finally {
            System.setOut(originalOut);
        }

        String actual = buffer.toString()
                .replace("\r\n", "\n")
                .replace("\r", "\n")
                .trim();

        String normalizedExpected = expected
                .replace("\r\n", "\n")
                .replace("\r", "\n")
                .trim();

        if (actual.equals(normalizedExpected)) {
            System.out.println("RESULT : PASS");
            System.exit(0);
        } else {
            System.out.println("RESULT : FAIL");
            System.exit(1);
        }
    }
}
