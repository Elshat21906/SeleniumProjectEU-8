package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_cssSelector_getText {
    public static void main(String[] args) {

        // TC #4: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser
        WebDriver t4 = WebDriverFactory.getDriver("chrome");
        t4.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        t4.get("https://login1.nextbasecrm.com/?forgot password=yes");

        // 3- Verify “Reset password” button text is as expected:
        // Expected: Reset password

        // Class Attribute
        // WebElement resetPasswordButton = t4.findElement(By.cssSelector("button[class='login-btn']"));

        // Value Attribute
         WebElement resetPasswordButton = t4.findElement(By.cssSelector("button[value='Reset password']"));

         String expectedResetPasswordButton = "Reset password";
         String actualResetPasswordButton = resetPasswordButton.getText();

        System.out.println("actualResetPasswordButton = " + actualResetPasswordButton);
        if(actualResetPasswordButton.equals(expectedResetPasswordButton)){
            System.out.println("Reset Password Button Verification Passed");
        }else{
            System.out.println("Reset Password Button Verification Failed");
        }

        //PS: Inspect and decide which locator you should be using to locate web elements.
        //        PS2: Pay attention to where to get the text of this button from


    }
}
