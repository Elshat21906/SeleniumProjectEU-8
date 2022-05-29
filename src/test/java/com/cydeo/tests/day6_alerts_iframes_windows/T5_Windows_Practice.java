package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

//1. Create a new class called: T5_WindowsPractice
public class T5_Windows_Practice {

    WebDriver driver;

    //2. Create new test and make set up
    @BeforeMethod
    public void setup(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    //3. Go to : https://practice.cydeo.com/windows
    driver.get("https://practice.cydeo.com/windows");

    }
    @Test
    public void multipleWindowsTest() throws InterruptedException {

        //Storing the main page's window handle as string is
        // good practice for future re-usable purposes
        String mainHandle = driver.getWindowHandle();
        System.out.println("mainHandle = " + mainHandle);

        //4. Assert: Title is “Windows”
        String expectedTitle = "Windows";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);

        System.out.println("Title Before Click " + actualTitle);

        //5. Click to: “Click Here” link
        WebElement HereLink = driver.findElement(By.xpath("//a[@target='_blank']"));
        Thread.sleep(1500);
        HereLink.click();

        //6. Switch to new Window.
        Set<String> allWindowHandles = driver.getWindowHandles();
        // window handle 1 - main window
        // window handle 2 - 2nd window
        for(String each : driver.getWindowHandles()){
            driver.switchTo().window(each);
            System.out.println("Current Title While Switching Window: " + driver.getTitle());
        }

        //7. Assert: Title is “New Window”
        String expectedTitleAfterClick = "New Window";
        String actualTitleAfterClick = driver.getTitle();

        Assert.assertEquals(actualTitleAfterClick,expectedTitleAfterClick);

        System.out.println("Title After Click: " + actualTitleAfterClick);

    }
    @AfterMethod
    public void tearDown(){
        driver.close();//close the new window
     // driver.quite(); close all windows
    }

}
/*
TC #5: Window Handle practice
1. Create a new class called: T5_WindowsPractice
2. Create new test and make set up
3. Go to : https://practice.cydeo.com/windows
4. Assert: Title is “Windows”
5. Click to: “Click Here” link
6. Switch to new Window.
7. Assert: Title is “New Window”
 */
