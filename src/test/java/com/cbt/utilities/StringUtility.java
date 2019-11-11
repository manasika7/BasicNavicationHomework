package com.cbt.utilities;

import java.util.Scanner;

public class StringUtility {

    public static void verifyEquals(String expected, String actual) {
        if (expected.equals(actual) ) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("Actual: " + actual);
            System.out.println("expected: "+ expected);
        }

    }
}
