package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {
    public static void main(String[] args) {


        //TC #2: NextBaseCRM, locators, getText(), getAttribute() practice 1- Open a chrome browser
        WebDriver t2 = WebDriverFactory.getDriver("chrome");
        t2.manage().window().maximize();

        // 2- Go to: https://login1.nextbasecrm.com/
        t2.get("https://login1.nextbasecrm.com/");

        // 3- Verify “remember me” label text is as expected:
        // Expected: Remember me on this computer
        WebElement rememberMeLabel = t2.findElement(By.className("login-item-checkbox-label"));
        String expectedRememberMeLabel = "Remember me on this computer";
        String actualRememberMeLabel = rememberMeLabel.getText();
        if(actualRememberMeLabel.equalsIgnoreCase(expectedRememberMeLabel)){
            System.out.println("Remember Me Verification Passed");
        }else{
            System.out.println("Remember Me Verification Failed");
        }
        rememberMeLabel.click();

        // 4- Verify “forgot password” link text is as expected:
        // Expected: Forgot your password?
        WebElement forgetPasswordLink = t2.findElement(By.className("login-link-forgot-pass"));
        String expected = "Forgot your password?";
        String actual = forgetPasswordLink.getText();
        if(actual.equalsIgnoreCase(expected)){
            System.out.println("Forgot Password Link Verification Passed");
        }else{
            System.out.println("Forgot Password Link Verification Failed");
        }

        // 5- Verify “forgot password” href attribute’s value contains expected:
        //Expected: forgot_password=yes
        String expectedInHref = "forgot_password=yes";
        String actualInHrefAttributeValue = forgetPasswordLink.getAttribute("href");

        //System.out.println("actualInHrefAttributeValue = " + actualInHrefAttributeValue);

        if(actualInHrefAttributeValue.contains(expectedInHref)){
            System.out.println("HREF attribute value verification Passed");
        }else{
            System.out.println("HREF attribute value verification Failed");
        }




    }
}
