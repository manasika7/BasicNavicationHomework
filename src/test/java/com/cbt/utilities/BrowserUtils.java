package com.cbt.utilities;

public class BrowserUtils {
    public static void wait(int seconds) {
        //It will be used to pause our test execution
        //just provide number of seconds as a parameter

        try {
            Thread.sleep(1000 * seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
