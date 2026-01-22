package com.obb.tests;

import com.obb.labs.transaction.Lab09_AccountTransactionApp;
import com.obb.labs.transaction.Lab09_AccountTransactionApp;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Lab09_AccountTransactionApp_Test {


    public static void main(String[] args) {

        String expected =
                "Interest Rate: 0.05\n" +
                        "----------------\n" +
                        "Account: Alice\n" +
                        "Balance before: 100.00\n" +
                        "Balance after : 105.00\n" +
                        "Withdraw 20? : true\n" +
                        "Balance now   : 85.00\n" +
                        "Withdraw 90? : false\n" +
                        "Balance now   : 85.00\n" +
                        "----------------\n" +
                        "Account: Bob\n" +
                        "Balance before: 50.00\n" +
                        "Balance after : 52.50\n" +
                        "Withdraw 20? : true\n" +
                        "Balance now   : 32.50\n" +
                        "Withdraw 40? : false\n" +
                        "Balance now   : 32.50\n" +
                        "----------------\n" +
                        "Account: Chitra\n" +
                        "Balance before: 200.00\n" +
                        "Balance after : 210.00\n" +
                        "Withdraw 20? : true\n" +
                        "Balance now   : 190.00\n" +
                        "Withdraw 150? : true\n" +
                        "Balance now   : 40.00\n" +
                        "----------------\n" +
                        "Account: Dev\n" +
                        "Balance before: 20.00\n" +
                        "Balance after : 21.00\n" +
                        "Withdraw 20? : true\n" +
                        "Balance now   : 1.00\n" +
                        "Withdraw 5? : false\n" +
                        "Balance now   : 1.00\n" +
                        "----------------\n" +
                        "Account: Esha\n" +
                        "Balance before: 75.50\n" +
                        "Balance after : 79.28\n" +
                        "Withdraw 20? : true\n" +
                        "Balance now   : 59.28\n" +
                        "Withdraw 60? : false\n" +
                        "Balance now   : 59.28\n" +
                        "----------------";

        PrintStream originalOut = System.out;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        System.setOut(new PrintStream(buffer));

        try {
            com.obb.labs.transaction.Lab09_AccountTransactionApp.main(new String[0]);
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
            System.out.println("RESULT : PASS");
            System.exit(0);
        } else {
            System.out.println("RESULT : FAIL");
            System.exit(1);
        }
    }
}
