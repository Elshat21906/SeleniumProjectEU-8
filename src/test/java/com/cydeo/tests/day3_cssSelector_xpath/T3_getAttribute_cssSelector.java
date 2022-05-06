package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getAttribute_cssSelector {
    public static void main(String[] args) {

        //TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
        // 1- Open a chrome browser
        WebDriver t3 = WebDriverFactory.getDriver("chrome");
        t3.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        t3.get("https://login1.nextbasecrm.com/");

        //3- Verify “Log in” button text is as expected:
        // Expected: Log In
        // WebElement logInButton = t3.findElement(By.className("login-btn"));

        //LOCATING THE SAME WEB ELEMENT USING DIFFERENT ATTRIBUTE VALUES.
        //	                   tagName[attribute='value']
        //                      input[class='login-btn']
        // Class Attribute
        // WebElement logInButton = t3.findElement(By.cssSelector("input[class='login-btn']"));
        // Type Attribute
        // WebElement logInButton = t3.findElement(By.cssSelector("input[type='submit']"));
        // Value Attribute
        WebElement logInButton = t3.findElement(By.cssSelector("input[value='Log In']"));
        String expectedButtonText = "Log In";
        String actualButtonText = logInButton.getAttribute("value");

        System.out.println("actualButtonText = " + actualButtonText);
        if(actualButtonText.equals(expectedButtonText)){
            System.out.println("Log In Button Verification Passed");
        }else{
            System.out.println("Log In Button Verification Failed");
        }
        t3.close();
        //  PS: Inspect and decide which locator you should be using to locate web elements.
        // PS2: Pay attention to where to get the text of this button from


    }
}
