package com.cydeo.tests.day4_FindElement_CheckBox_RadioButton;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T5_CheckBoxes {
    public static void main(String[] args) throws InterruptedException {


       // Practice: Checkboxes
        WebDriver T5 = WebDriverFactory.getDriver("chrome");
        T5.manage().window().maximize();
        T5.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

       // 1. Go to http://practice.cydeo.com/checkboxes
        T5.get("http://practice.cydeo.com/checkboxes");

        // We have to locate CheckBoxes
        WebElement checkbox1 = T5.findElement(By.xpath("//input[@name='checkbox1']"));
        WebElement checkbox2 = T5.findElement(By.xpath("//input[@name='checkbox2']"));

        // 2. Confirm checkbox #1 is NOT selected by default
        System.out.println("checkbox1.isSelected(),expecting false = " + checkbox1.isSelected());

        // 3. Confirm checkbox #2 is SELECTED by default.
        System.out.println("checkbox2.isSelected(),expecting true = " + checkbox2.isSelected());

        // 4. Click checkbox #1 to select it.
        Thread.sleep(2000);
        checkbox1.click();


        // 5. Click checkbox #2 to deselect it.

        // 6. Confirm checkbox #1 is SELECTED.
        // 7. Confirm checkbox #2 is NOT selected.

    }
}
/*
Practice: Checkboxes
1. Go to http://practice.cydeo.com/checkboxes
2. Confirm checkbox #1 is NOT selected by default 3. Confirm checkbox #2 is SELECTED by default.
4. Click checkbox #1 to select it.
5. Click checkbox #2 to deselect it.
6. Confirm checkbox #1 is SELECTED.
7. Confirm checkbox #2 is NOT selected.
 */
