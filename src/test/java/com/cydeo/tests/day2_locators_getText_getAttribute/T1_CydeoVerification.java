package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerification {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver test1 = new ChromeDriver();
        test1.manage().window().maximize();

        test1.get("https://practice.cydeo.com");

        String expectedURL= "cydeo";
        String actualURL = test1.getCurrentUrl();
        if(actualURL.contains(expectedURL)){
            System.out.println("URL Passed");
        }else{
            System.out.println("URL Not Passed");
        }

        String expectedTitle = "Practice";
        String actualTitle = test1.getTitle();
        if(actualTitle.contains(expectedTitle)){
            System.out.println("Title Passed");
        }else{
            System.out.println("Title Not Passed");
        }

        Thread.sleep(3000);

        test1.close();




    }
}
