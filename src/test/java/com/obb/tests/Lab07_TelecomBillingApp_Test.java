package com.obb.tests;

import com.obb.labs.loop_branch.Lab07_TelecomBillingApp;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Lab07_TelecomBillingApp_Test {

    public static void main(String[] args) {

        String expected =
                "=== OBB Telecom Bill ===\n" +
                        "Customer : Asha\n" +
                        "Plan     : PRO\n" +
                        "Months   : 14\n" +
                        "BaseFee  : 499.00\n" +
                        "Loyalty% : 10\n" +
                        "Tax%     : 18\n" +
                        "--------------------------------\n" +
                        "SubTotal : 6986.00\n" +
                        "Discount : 698.60\n" +
                        "Tax      : 1131.73\n" +
                        "Total    : 7419.13\n" +
                        "--------------------------------\n" +
                        "Status   : ACTIVE\n" +
                        "First 3 due amounts:\n" +
                        "Month 1  : 529.94\n" +
                        "Month 2  : 529.94\n" +
                        "Month 3  : 529.94";

        PrintStream originalOut = System.out;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        System.setOut(new PrintStream(buffer));

        try {
            com.obb.labs.loop_branch.Lab07_TelecomBillingApp.main(new String[0]);
        } catch (Exception e) {
            // Let comparison fail if crash occurs
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
            System.out.print("RESULT : PASS");
            System.exit(0);
        } else {
            System.out.print("RESULT : FAIL");
            System.exit(1);
        }
    }

}
