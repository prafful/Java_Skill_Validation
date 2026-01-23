package com.obb.tests;


import com.obb.labs.strings.Lab11_FileNameConverter;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Lab11_FileArchiveApp_Test {

    public static void main(String[] args) {
        String expected =
                "Original : example.doc\n" +
                        "Archived : example.bak";

        PrintStream originalOut = System.out;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        System.setOut(new PrintStream(buffer));

        try {
            Lab11_FileNameConverter.main(new String[0]);
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
