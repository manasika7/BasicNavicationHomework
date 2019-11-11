package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification3 {
    public static void main(String[] args) {
        List<String> urls = Arrays.asList("https://lulugandgeorgia.com",
                "https://wayfair.com/", "https://walmart.com", "https://westelm.com");
        //open chrome browser


        for (int i = 0; i < urls.size(); i++) {
            WebDriver chromeDriver = BrowserFactory.getDriver("chrome");
            chromeDriver.navigate().to(urls.get(i));
            String title = chromeDriver.getTitle();
            chromeDriver.close();

            String pureURL = urls.get(i).substring(8,urls.get(i).indexOf("."));
            String pureTitle = title.trim().toLowerCase().replaceAll("\\s+","");
            System.out.println(pureURL);
            System.out.println(pureTitle);
            if(pureTitle.contains(pureURL)) {
                System.out.println("PASS");
            } else {
                System.out.println("FAIL");
            }

            chromeDriver.quit();
        }





    }
}
