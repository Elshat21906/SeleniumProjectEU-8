package com.cydeo.tests.day5_Testing_Intro_DropDowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T3_RadioButton_Cont {
    public static void main(String[] args) {

        //TC #2: Radiobutton handling
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //2. Go to https://practice.cydeo.com/radio_buttons
        driver.get(" https://practice.cydeo.com/radio_buttons");

        //Locate name='sports' radio buttons and store them in a List of Web Element
        List<WebElement> sportRadioButton = driver.findElements(By.name("sport"));

        //Loop through the List of WebElement and select matching result "hockey"
        for (WebElement each : sportRadioButton) {

            String eachID = each.getAttribute("id");
            System.out.println("eachID = " + eachID);

            if(eachID.equals("hockey")){
                each.click();
                System.out.println("Hockey is selected: " + each.isSelected());
                break;
            }
        }




    }
}
