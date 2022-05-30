package com.cydeo.tests.day7_webtables_utilities_javafaker;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T3_CRM_LOGIN {

    public WebDriver driver;

    // 1. Create new test and make setups
    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    // TC #3: Login scenario
    @Test
    public void crm_login_test(){
        // 2. Goto:http://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

       // 3. Enter valid username
        WebElement inputUsername = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUsername.sendKeys("helpdesk1@cybertekschool.com ");

        //helpdesk1@cybertekschool.com  UserUser
        //Helpdesk2@cybertekschool.com  UserUser

       // 4. Enter valid password
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys("UserUser");

       // 5. Click to`LogIn`button
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();

       // 6. Verify title is as expected:
       // Expected: Portal
        BrowserUtils.verifyTitle(driver,"Portal");
    }
}
/*
TC #3: Login scenario
1. Create new test and make setups
2. Goto:http://login1.nextbasecrm.com/
3. Enter valid username
4. Enter valid password
5. Click to`LogIn`button
6. Verify title is as expected:
 Expected: Portal

 */