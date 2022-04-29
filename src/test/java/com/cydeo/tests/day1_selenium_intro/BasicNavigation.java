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

        // this line will maximize the browser window
        driver.manage().window().maximize();

        // 3- go to "https://www.tesla.com"
        driver.get("https://www.tesla.com");
        // get th title of page
        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);
        String currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);




        // Stop code execution for 1 seconds
        Thread.sleep(1000);
        // 4- use selenium navigate back
        driver.navigate().back();
        // Stop code execution for 1 seconds
        Thread.sleep(1000);
        // 5- use selenium navigate forward
        driver.navigate().forward();
        // Stop code execution for 1 seconds
        Thread.sleep(1000);


        // use selenium to navigate refresh
        driver.navigate().refresh();


        // use navigate().to();
        driver.navigate().to("https://www.google.com");

        // get the current title after getting the Google page
        currentTitle = driver.getTitle();


        // get th title of page
        //System.out.println("driver.getTitle()= " + driver.getTitle());
        System.out.println("currentTitle = " + currentTitle);


        // Get the current URL using Selenium
        currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);






    }
}
