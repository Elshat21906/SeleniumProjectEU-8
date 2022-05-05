package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_getText_getAttribute {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver test5 = new ChromeDriver();
        test5.manage().window().maximize();

        test5.get("https://practice.cydeo.com/registration_form");

        //3- Verify header text is as expected:
        WebElement headerText = test5.findElement(By.tagName("h2"));

        String expectedHeaderText = "Registration form";
        String actualHeaderText = headerText.getText();

        if(actualHeaderText.equals(expectedHeaderText)){
            System.out.println("Header Text Verification Passed");
        }else{
            System.out.println("Header Text Verification Failed");
        }


        //4- Locate “First name” input box
        WebElement firstName = test5.findElement(By.name("firstname"));

        //5- Verify placeholder attribute’s value is as expected:
        // Expected: first name
        String expectedPlaceHolder = "first name";
        String actualPlaceHolder = firstName.getAttribute("placeholder");
        if(actualHeaderText.equals(expectedHeaderText)){
            System.out.println("PlaceHolder Verification Passed");
        }else{
            System.out.println("PlaceHolder Verification Failed");
        }



    }
}
