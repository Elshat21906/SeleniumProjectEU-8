package com.cydeo.tests.day4_FindElement_CheckBox_RadioButton;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class T1_xpath_cssSelector_practice {
    public static void main(String[] args) {


        // TC #1: XPATH and cssSelector Practices

        //  1. Open Chrome browser
        WebDriver t1 = WebDriverFactory.getDriver("chrome");
        t1.manage().window().maximize();

        // 2. Go to https://practice.cydeo.com/forgot_password
        t1.get("https://practice.cydeo.com/forgot password");

        // 3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)

        //a. “Home” link
        //b. “Forgot password” header c. “E-mail” text
        //d. E-mail input box
        //e. “Retrieve password” button f. “Powered by Cydeo text

        //4. Verify all web elements are displayed.
        // First solve the task with using cssSelector only. Try to create 2 different
        // cssSelector if possible
        // Then solve the task using XPATH only. Try to create 2 different XPATH locator if possible
    }
}

