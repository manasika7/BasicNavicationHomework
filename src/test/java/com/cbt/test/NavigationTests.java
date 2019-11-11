package com.cbt.test;


import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class NavigationTests {
    public static void main(String[] args)  {
        // CHROME
        // get driver
        WebDriver chromeDriver = BrowserFactory.getDriver("chrome");
        // open browser and go to google.com
        chromeDriver.get("https://google.com");
        // get page title
        String chromeGoogleTitle = chromeDriver.getTitle();

        // open browser and go to etsy.com
        chromeDriver.navigate().to("https://etsy.com");
        // get page title
        String chromeEtsyTitle = chromeDriver.getTitle();

        // go back the previous page
        chromeDriver.navigate().back();

        // get page title
        String actualChromeTitle=chromeDriver.getTitle();

        // test titles are same
        StringUtility.verifyEquals(chromeGoogleTitle, actualChromeTitle);

        // go to next page
        chromeDriver.navigate().forward();

        // get page title
        actualChromeTitle=chromeDriver.getTitle();
        // test titles are same
        StringUtility.verifyEquals(chromeEtsyTitle, actualChromeTitle);

        chromeDriver.quit();

        // FIREFOX
        // get driver
        WebDriver firefoxDriver = BrowserFactory.getDriver("firefox");
        // open browser and go to google.com
        firefoxDriver.get("https://google.com");
        // get page title
        String firefoxGoogleTitle = firefoxDriver.getTitle();

        // open browser and go to etsy.com
        firefoxDriver.navigate().to("https://etsy.com");
        // get page title
        String firefoxEtsyTitle = firefoxDriver.getTitle();

        // go back the previous page
        firefoxDriver.navigate().back();

        // get page title
        String actualfirefoxTitle=firefoxDriver.getTitle();

        // test titles are same
        StringUtility.verifyEquals(firefoxGoogleTitle, actualfirefoxTitle);

        // go to next page
        firefoxDriver.navigate().forward();

        // get page title
        actualfirefoxTitle=firefoxDriver.getTitle();
        // test titles are same
        StringUtility.verifyEquals(firefoxEtsyTitle, actualfirefoxTitle);

        firefoxDriver.quit();
    }
}
