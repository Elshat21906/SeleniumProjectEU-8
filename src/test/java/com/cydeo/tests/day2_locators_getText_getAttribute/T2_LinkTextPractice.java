package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_LinkTextPractice {
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();

        WebDriver test2 = new ChromeDriver();
        test2.manage().window().maximize();

        test2.get("https://practice.cydeo.com");

        //test2.findElement(By.linkText("A/B Testing")).click();
        WebElement abTestLink = test2.findElement(By.linkText("A/B Testing"));
        abTestLink.click();


        String expectedTitle1 = "No A/B Test";
        String actualTitle = test2.getTitle();
        if(actualTitle.contains(expectedTitle1)){
            System.out.println("Title Verification Passed");
        }else{
            System.out.println("Title Verification Failed");
        }
        Thread.sleep(2000);

        test2.navigate().back();

        String expectedTitle2 = "Practice";
        String actualTitle2 = test2.getTitle();
        if(actualTitle2.contains(expectedTitle2)){
            System.out.println("Title Verification Passed");
        }else{
            System.out.println("Title Verification Failed");
        }

        test2.close();




    }
}
