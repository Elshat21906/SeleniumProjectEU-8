package com.cydeo.tests.day3_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_Locators_getText {
    public static void main(String[] args) {


        // TC #1: NextBaseCRM, locators and getText() practice

        WebDriverManager.chromedriver().setup();

        // 1- Open a chrome browser
        WebDriver driver1 = new ChromeDriver();
        driver1.manage().window().maximize();

        // 2- Go to: https://login1.nextbasecrm.com/
        driver1.get("https://login1.nextbasecrm.com/");

        // 3- Enter incorrect username: “incorrect”
        WebElement userNameInput = driver1.findElement(By.className("login-inp"));
        userNameInput.sendKeys("incorrect");

        // 4- Enter incorrect password: “incorrect”
        WebElement passwordInput = driver1.findElement(By.name("USER_PASSWORD"));
        passwordInput.sendKeys("incorrect");

        // 5- Click to login button.
        WebElement loginButton = driver1.findElement(By.className("login-btn"));
        loginButton.click();

        // 6- Verify error message text is as expected:
        // Expected: Incorrect login or password
        WebElement errorMessage = driver1.findElement(By.className("errortext"));

       String expectedErrorMessage = "Incorrect login or password";
       String actualErrorMessage = errorMessage.getText();
       if(actualErrorMessage.equals(expectedErrorMessage)){
           System.out.println("Passed");
        }else{
           System.out.println("Failed");
       }





    }
}
