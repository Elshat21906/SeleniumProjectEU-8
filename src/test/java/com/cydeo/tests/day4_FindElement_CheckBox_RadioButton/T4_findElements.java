package com.cydeo.tests.day4_FindElement_CheckBox_RadioButton;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T4_findElements {
    public static void main(String[] args) {

       // TC #4: FindElements Task
       // 1- Open a chrome browser
        WebDriver t4 = WebDriverFactory.getDriver("chrome");
        t4.manage().window().maximize();
        //Providing extra wait time for our driver before it throws NoSuchElementException
        t4.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

       // 2- Go to: https://practice.cydeo.com/abtest
        t4.get("https://practice.cydeo.com/abtest");

        // 3- Locate all the links in the page.
        List<WebElement> allLinks = t4.findElements(By.tagName("a"));

        // 4- Print out the number of the links on the page.
        System.out.println("allLinks.size() = " + allLinks.size());

        // 5- Print out the t
        // 6- Print out the HREF attribute values of the linksexts of the links.
        for (WebElement each : allLinks) {
            System.out.println("Text Of Links: " + each.getText());
            System.out.println("Href Value: " + each.getAttribute("href"));
        }




    }
}
/*
TC #4: FindElements Task
1- Open a Chrome browser
2- Go to: https://practice.cydeo.com/abtest
3- Locate all the links in the page.
4- Print out the number of the links on the page. 5- Print out the texts of the links.
6- Print out the HREF attribute values of the links
 */
