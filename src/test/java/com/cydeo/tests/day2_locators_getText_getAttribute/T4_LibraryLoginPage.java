package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_LibraryLoginPage {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver test4 = new ChromeDriver();
        test4.manage().window().maximize();

        test4.get("https://library2.cybertekschool.com/login.html");

        //3. Enter username: “incorrect@email.com”
        WebElement userNameInput = test4.findElement(By.className("form-control"));
        userNameInput.sendKeys("incorrect@email.com");

        //4. Enter password: “incorrect password”
        WebElement passwordInput = test4.findElement(By.id("inputPassword"));
        passwordInput.sendKeys("incorrect password");

        //5. Click to Sign in button
        WebElement signInButton = test4.findElement(By.tagName("button"));
        signInButton.click();

        //6. Verify: visually “Sorry, Wrong Email or Password”

        //displayed

    }
}
