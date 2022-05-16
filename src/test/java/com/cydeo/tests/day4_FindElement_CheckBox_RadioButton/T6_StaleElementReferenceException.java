package com.cydeo.tests.day4_FindElement_CheckBox_RadioButton;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T6_StaleElementReferenceException {
    public static void main(String[] args) {

        //How to move lines up and down without having to copy and paste: command + shift + up & down

       // 1- Open a Chrome browser
        WebDriver T6 = WebDriverFactory.getDriver("chrome");
        T6.manage().window().maximize();

        //Providing extra wait time for our driver before it throws NoSuchElementException
        T6.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

       // 2- Go to: https://practice.cydeo.com/abtest
        T6.get("https://practice.cydeo.com/abtest");

       // 3- Locate “CYDEO” link, verify it is displayed.
       // WebElement cydeoLink = T6.findElement(By.xpath("//a[@href='https://cydeo.com/']"));
        WebElement cydeoLink = T6.findElement(By.xpath("//a[text()='CYDEO']"));
        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());


        // 4- Refresh the page.
        T6.navigate().refresh();

        //We are refreshing the web element reference by re-assigning(re-locating)the web element
        cydeoLink = T6.findElement(By.xpath("//a[text()='CYDEO']"));

        // 5- Verify it is displayed, again.
        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());


        // This is a simple StaleElementReferenceException to understand what is this exception and how to handle it.

        //How to move lines up and down without having to copy and paste: command + shift + up & down

    }


}
/*
TC #6: StaleElementReferenceException Task
1- Open a Chrome browser
2- Go to: https://practice.cydeo.com/abtest
3- Locate “CYDEO” link, verify it is displayed.
4- Refresh the page.
5- Verify it is displayed, again.
This is a simple StaleElementReferenceException to understand what is this exception and how to handle it.
 */
