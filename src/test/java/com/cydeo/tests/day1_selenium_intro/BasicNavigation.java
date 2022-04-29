package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {

    public static void main(String[] args) throws InterruptedException {

        // 1- set up the browser driver
        WebDriverManager.chromedriver().setup();

        // 2- Create instance of Selenium WebDriver
        // This is the line opening an empty browser
        WebDriver driver = new ChromeDriver();

        // 3- go to "https://www.tesla.com"
        driver.get("https://www.tesla.com");

        // Stop code execution for 2 seconds
        Thread.sleep(2000);

        // 4- use selenium navigate back
        driver.navigate().back();

        // Stop code execution for 2 seconds
        Thread.sleep(2000);
        
        // 5- use selenium navigate forward
        driver.navigate().forward();

        // Stop code execution for 2 seconds
        Thread.sleep(2000);

        // use selenium to navigate refresh
        driver.navigate().refresh();

        // use navigate().to();
        driver.navigate().to("https://www.google.com");

        // get th title of page
        //System.out.println("driver.getTitle()= " + driver.getTitle());

        String currentTitle = driver.getTitle();


    }
}
