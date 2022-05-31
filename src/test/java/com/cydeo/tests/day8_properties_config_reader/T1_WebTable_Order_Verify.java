package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_WebTable_Order_Verify {

    public WebDriver driver;

    @BeforeMethod

    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test

    public void order_name_verify_test(){

        //TC #1: Web table practice
        //1. Goto:https://practice.cydeo.com/web-tables
        driver.get("https://practice.cydeo.com/web-tables");

        // Locate the cell that has Bob Martin text in it
        WebElement bobMartinCell = driver.findElement(By.xpath("//table[@class='SampleTable']//td[.='Bob Martin']"));

        //2. VerifyBob’s name is listed as expected.
        //Expected: “Bob Martin”
        String expectedName = "Bob Martin";
        String actualName = bobMartinCell.getText();
        Assert.assertEquals(actualName,expectedName);

        //3. VerifyBobMartin’s order date is as expected: 12/31/2021
        WebElement bobMartinDateCell = driver.findElement(By.xpath("//table[@class='SampleTable']//td[.='Bob Martin']/following-sibling::td[3]"));
        String expectedBobMartinOrderDate = "12/31/2021";
        String actualBobMartinOrderDate = bobMartinDateCell.getText();
        Assert.assertEquals(actualBobMartinOrderDate,expectedBobMartinOrderDate);


    }

}
/*
TC #1: Web table practice
1. Goto:https://practice.cydeo.com/web-tables
2. VerifyBob’s name is listed as expected.
Expected: “Bob Martin”
3. VerifyBobMartin’s order date is as expected: 12/31/2021
 */