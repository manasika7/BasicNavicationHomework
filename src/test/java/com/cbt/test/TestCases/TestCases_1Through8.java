package com.cbt.test.TestCases;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class TestCases_1Through8 {
    public static void main(String[] args) {


        //Test case#1:
        /*
        Step 3. Enter any valid name
        Step 4. Enter any valid email
        Step 5. Click on “Sign Up” button
        Expected result: Following message should be
        displayed: “Thank you for signing up. Click the
        button below to return to the home page.” Home
        button should be displayed.
         */

        WebDriver driver = BrowserFactory.getDriver("chrome");
        //Step 1. Go to http://practice.cybertekschool.com/
        driver.get("http://practice.cybertekschool.com/");
        BrowserUtils.wait(3);
        //Step 2. Click on “Sign Up For Mailing List”

        driver.findElement(By.linkText("Sign Up For Mailing List")).click();

        //wait
        BrowserUtils.wait(3);

        // Step 3. Enter any valid name
        driver.findElement(By.name("full_name")).sendKeys("Test User");

        // Step 4. Enter any valid email
        driver.findElement(By.name("email")).sendKeys("test_email@email.com");

        // Step 5. Click on “Sign Up” button
        driver.findElement(By.name("wooden_spoon")).click();
        BrowserUtils.wait(3);

        /*
         Expected result: Following message should be
        displayed: “Thank you for signing up. Click the
        button below to return to the home page.” Home
        button should be displayed.
         */
        String expectedResult="Thank you for signing up. Click the button below to return to the home page.";
        WebElement message= driver.findElement(By.className("subheader"));
        String ActualResult= message.getText();

        if(expectedResult.equals(ActualResult)){
            System.out.println("Test case #1 passed");

        }else{
            System.out.println("Test case #1 failed");
        }


        BrowserUtils.wait(3);

       // Test case #2
       // Step 1. Go to http://practice.cybertekschool.com/

        driver.get("http://practice.cybertekschool.com/");
        BrowserUtils.wait(3);

        /*Step 2. Verify that number of listed examples is
        equals to 48.
        Hint: use findElements() and size()
        methods.
        */
        List<WebElement> lists = driver.findElements(By.className("list-group-item"));
        int expectedListNumber = 48;
        int actualListNumber = lists.size();

        if(expectedListNumber == actualListNumber){
            System.out.println("Test case #2 passed");

        }else{
            System.out.println("Test case #2 failed");
        }

        BrowserUtils.wait(3);


        // Test case #3

       // Step 1. Go to http://practice.cybertekschool.com/

        driver.get("http://practice.cybertekschool.com/");
        BrowserUtils.wait(3);

       // Step 2. Click on “Multiple Buttons”
        driver.findElement(By.linkText("Multiple Buttons")).click();
        BrowserUtils.wait(3);

        //Step 3. Click on “Button 1”
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/button[1]")).click();
        BrowserUtils.wait(1);
        // Verify that result message is displayed: “Clicked on button one!”
        WebElement testCase3ResultElement = driver.findElement(By.id("result"));

        String testCase3Expected = "Clicked on button one!";
        String testCase3Actual = testCase3ResultElement.getText();

        if(testCase3Expected.equals(testCase3Actual)){
            System.out.println("Test case #3 passed");

        }else{
            System.out.println("Test case #3 failed");
        }

        BrowserUtils.wait(3);

        // Test case #4
        // Step 1. Go to http://practice.cybertekschool.com/

        driver.get("http://practice.cybertekschool.com/");
        BrowserUtils.wait(3);


        // Step 2. Click on “Registration Form”
        driver.findElement(By.linkText("Registration Form")).click();
        BrowserUtils.wait(3);

        // Step 3. Enter “123” into first name input box.
        driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[1]/div/input")).sendKeys("123");

         // Step 4. Verify that warning message is displayed:
        //“first name can only consist of alphabetical letters”

        WebElement testCase4WarningElement = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[1]/div/small[3]"));

        String testCase4Expected = "first name can only consist of alphabetical letters";
        String testCase4Actual = testCase4WarningElement.getText();

        if(testCase4Expected.equals(testCase4Actual)){
            System.out.println("Test case #4 passed");

        }else{
            System.out.println("Test case #4 failed");
        }

        BrowserUtils.wait(3);

        // Test case #5
        // Step 1. Go to http://practice.cybertekschool.com/

        driver.get("http://practice.cybertekschool.com/");
        BrowserUtils.wait(3);

        // Step 2. Click on “Registration Form”
        driver.findElement(By.linkText("Registration Form")).click();
        BrowserUtils.wait(3);

        // Step 3. Enter “123” into last name input box.
        driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[2]/div/input")).sendKeys("123");

        // Step 4. Verify that warning message is displayed:
        // “The last name can only consist of alphabetical letters and dash”

        WebElement testCase5WarningElement = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[2]/div/small[3]"));

        String testCase5Expected = "The last name can only consist of alphabetical letters and dash";
        String testCase5Actual = testCase5WarningElement.getText();

        if(testCase5Expected.equals(testCase5Actual)){
            System.out.println("Test case #5 passed");

        }else{
            System.out.println("Test case #5 failed");
        }

        BrowserUtils.wait(3);

        // Test case #6
        // Step 1. Go to http://practice.cybertekschool.com/

        driver.get("http://practice.cybertekschool.com/");
        BrowserUtils.wait(3);

        // Step 2. Click on “Registration Form”
        driver.findElement(By.linkText("Registration Form")).click();
        BrowserUtils.wait(3);

        // Step 3. Enter “user” into user name input box.
        driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[3]/div/input")).sendKeys("user");

        // Step 4. Verify that warning message is displayed:
        // “The username must be more than 6 and less than
        // 30 characters long”

        WebElement testCase6WarningElement = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[3]/div/small[2]"));

        String testCase6Expected = "The username must be more than 6 and less than 30 characters long";
        String testCase6Actual = testCase6WarningElement.getText();

        if(testCase6Expected.equals(testCase6Actual)){
            System.out.println("Test case #6 passed");

        }else{
            System.out.println("Test case #6 failed");
        }

        BrowserUtils.wait(3);

        // Test case #7
        // Step 1. Go to http://practice.cybertekschool.com/

        driver.get("http://practice.cybertekschool.com/");
        BrowserUtils.wait(3);

        // Step 2. Click on “Registration Form”
        driver.findElement(By.linkText("Registration Form")).click();
        BrowserUtils.wait(3);

        // Step 3. Enter “testers@email” into email input box.
        driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[4]/div/input")).sendKeys("testers@email");

        // Step 4. Verify that warning message is displayed:
        // "email address is not a valid Email format is not correct"


        WebElement testCase7WarningElement = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[4]/div/small[2]"));

        String testCase7Expected = "email address is not a valid";
        String testCase7Actual = testCase7WarningElement.getText();

        if(testCase7Expected.equals(testCase7Actual)){
            System.out.println("Test case #7 passed");

        }else{
            System.out.println("Test case #7 failed");
        }

        BrowserUtils.wait(3);

        // Test case #8
        // Step 1. Go to http://practice.cybertekschool.com/

        driver.get("http://practice.cybertekschool.com/");
        BrowserUtils.wait(3);

        // Step 2. Click on “Registration Form”
        driver.findElement(By.linkText("Registration Form")).click();
        BrowserUtils.wait(3);

        // Step 3. Enter “5711234354” into phone number  input box.

        driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[6]/div/input")).sendKeys("5711234354");

        // Step 4. Verify that warning message is displayed:
        // “Phone format is not correct”


        WebElement testCase8WarningElement = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[6]/div/small[2]"));

        String testCase8Expected = "Phone format is not correct";
        String testCase8Actual = testCase8WarningElement.getText();

        if(testCase8Expected.equals(testCase8Actual)){
            System.out.println("Test case #8 passed");

        }else{
            System.out.println("Test case #8failed");
        }

        BrowserUtils.wait(3);



        // Close browser
        driver.quit();



    }
}

