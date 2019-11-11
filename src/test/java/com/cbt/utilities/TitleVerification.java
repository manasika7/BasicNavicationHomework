package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification {
    public static void main(String[] args) {
        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");
        //open chrome browser
        WebDriver chromeDriver = BrowserFactory.getDriver("chrome");



        // visit the websites
        chromeDriver.get("http://practice.cybertekschool.com/");
        //get the title of the website
        String chromepractice1Title = chromeDriver.getTitle();
        // visit the next websites
        chromeDriver.navigate().to("http://practice.cybertekschool.com/dropdown");
        //get the title of the website
        String chromepractice2Title = chromeDriver.getTitle();
        // visit the next websites
        chromeDriver.navigate().to("http://practice.cybertekschool.com/login");
        //get the title of the website
        String chromepractice3Title = chromeDriver.getTitle();

        // test titles are same
        StringUtility.verifyEquals(chromepractice3Title, chromepractice2Title);
        StringUtility.verifyEquals(chromepractice2Title, chromepractice1Title);

        for (int i = 0; i < urls.size(); i++) {
            if(urls.get(i).indexOf("http://practice.cybertekschool.com") > -1) {
                System.out.println(i + " - INCLUDES");
            } else {
                System.out.println("NOT INCLUDES");
                break;
            }
        }

        chromeDriver.quit();

    }
}
