package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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
    public void multipleWindowsTest(){



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
