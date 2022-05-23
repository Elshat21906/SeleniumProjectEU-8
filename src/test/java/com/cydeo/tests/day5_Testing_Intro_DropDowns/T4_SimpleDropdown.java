package com.cydeo.tests.day5_Testing_Intro_DropDowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_SimpleDropdown {

    WebDriver driver;

    @BeforeMethod

    public void setupMethod(){

        // TC#4: Verifying “Simple dropdown” and “State selection” dropdown default values
        // 1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // 2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");

    }

    @Test
    public void simpleDropDownTest(){

        // 3. Verify “Simple dropdown” default selected value is correct
        Select simpleDropDown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));

        WebElement currentlySelectedOption = simpleDropDown.getFirstSelectedOption();

        String actualSimpleDropDownOptionText = currentlySelectedOption.getText();
        String expectedSimpleDropDownOptionText = "Please select an option";

        // Expected: “Please select an option”
        Assert.assertEquals(actualSimpleDropDownOptionText,expectedSimpleDropDownOptionText);


        //4. Verify “State selection” default selected value is correct
        Select stateDropDown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        //Expected: “Select a State”
        String expectedStateDropDownText = "Select a State";
        String actualStateDropDownText = stateDropDown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualStateDropDownText,expectedStateDropDownText);

        //Assert.assertEquals(stateDropDown.getFirstSelectedOption().getText(),"Select a State");





    }


}

