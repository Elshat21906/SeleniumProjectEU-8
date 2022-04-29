package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_YahooTitleVerification {
    public static void main(String[] args) {

        //set up for browser driver
        WebDriverManager.chromedriver().setup();

        //open Chrome browser
        WebDriver test = new ChromeDriver();
        test.manage().window().maximize();

        //go to the yahoo website
        test.get("https://www.yahoo.com");


        // verify Title
        String expectedTitle = "Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";
        // Actual title comes from the browser
        String actualTitle = test.getTitle();

        if(expectedTitle.equals(actualTitle)){
            System.out.println("Title is as expected, Verification is PASSED");
        }else{
            System.out.println("Verification is NOT PASSED");
        }

        //close the  yahoo website
        test.close();


    }
}
