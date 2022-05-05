package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearch {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver test3 = new ChromeDriver();
        test3.manage().window().maximize();

        test3.get("https://www.google.com");

        //3- Write “apple” in search box
        //4- PRESS ENTER using Keys.ENTER
        WebElement googleSearchBox = test3.findElement(By.name("q"));
        googleSearchBox.sendKeys("apple" + Keys.ENTER);

        String expectedTitle = "apple";
        String actualTitle = test3.getTitle();
        if(actualTitle.startsWith(expectedTitle)){
            System.out.println("Title Verification Passed");
        }else{
            System.out.println("Title Verification Failed");
        }

        test3.close();





    }
}
