package com.obb.tests;

import com.obb.labs.lambdas.Lab16_LambdaLabApp;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Lab16_LambdaLabApp_Test {

    public static void main(String[] args) {

        String expected =
                "HELLO : hello world\n" +
                        "ORDER : OBB-1001\n" +
                        "AMOUNT: 1000.00\n" +
                        "RULE  : VIP 10% OFF\n" +
                        "FINAL : 900.00\n" +
                        "TAX   : 162.00\n" +
                        "TOTAL : 1062.00\n" +
                        "ITEMS : 1 2 3 4 5\n" +
                        "MAP   : 1->1 2->4 3->9";

        PrintStream originalOut = System.out;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        System.setOut(new PrintStream(buffer));

        try {
            Lab16_LambdaLabApp.main(new String[0]);
        } catch (Exception e) {
            // ensure restore then fail
        } finally {
            System.setOut(originalOut);
        }

        String actual = buffer.toString()
                .replace("\r\n", "\n")
                .replace("\r", "\n")
                .trim();

        expected = expected
                .replace("\r\n", "\n")
                .replace("\r", "\n")
                .trim();

        if (actual.equals(expected)) {
            System.out.println("RESULT : PASS");
            System.exit(0);
        } else {
            System.out.println("RESULT : FAIL");
            System.exit(1);
        }
    }
}
