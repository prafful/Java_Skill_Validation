package com.obb.tests;

import com.obb.labs.strings.Lab13_SubstringScanApp;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Lab13_SubstringScanApp_Test {

    public static void main(String[] args) {
        String expected =
                "Needle  : ow\n" +
                        "Count   : 3";

        PrintStream originalOut = System.out;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        System.setOut(new PrintStream(buffer));

        try {
            Lab13_SubstringScanApp.main(new String[0]);
        } finally {
            System.setOut(originalOut);
        }

        String actual = buffer.toString()
                .replace("\r\n", "\n").replace("\r", "\n")
                .trim();

        if (expected.equals(actual)) {
            System.out.print("RESULT : PASS");
            System.exit(0);
        } else {
            System.out.print("RESULT : FAIL");
            System.exit(1);
        }
    }
}
