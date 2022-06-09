package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T3_Actions_Hover {

    @Test
    public void hovering_Test(){
        //TC #3: Hover Test
        //1. Go to https://practice.cydeo.com/hovers
        Driver.getDriver().get("https://practice.cydeo.com/hovers ");

        //Locate all the images under here:
        WebElement img1 = Driver.getDriver().findElement(By.xpath("(//img)[1]"));
        WebElement img2 = Driver.getDriver().findElement(By.xpath("(//img)[2]"));
        WebElement img3 = Driver.getDriver().findElement(By.xpath("(//img)[3]"));


        //Locate all the "user" texts under here:

        // (//h5)[1]
        WebElement user1 = Driver.getDriver().findElement(By.xpath("//h5[text()='name: user1']"));
        // (//h5)[2]
        WebElement user2 = Driver.getDriver().findElement(By.xpath("//h5[text()='name: user2']"));
        // (//h5)[3]
        WebElement user3 = Driver.getDriver().findElement(By.xpath("//h5[text()='name: user3']"));

        Actions actions = new Actions(Driver.getDriver());
        //2. Hover over to first image
        actions.moveToElement(img1).perform();

        //3. Assert:
        //a. “name: user1” is displayed
        Assert.assertTrue(user1.isDisplayed());
        //4. Hover over to second image

        //5. Assert:
        //a. “name: user2” is displayed

        //7. Confirm:
        //a. “name: user3” is displayed b. “view profile” is displayed
    }

}
/*
TC #3: Hover Test
1. Go to https://practice.cydeo.com/hovers 2. Hover over to first image
3. Assert:
a. “name: user1” is displayed
b. “view profile” is displayed 4. Hover over to second image
5. Assert:
a. “name: user2” is displayed
b. “view profile” is displayed 6. Hover over to third image
7. Confirm:
a. “name: user3” is displayed b. “view profile” is displayed
 */
