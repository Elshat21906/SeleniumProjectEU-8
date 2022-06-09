package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T3_Actions_Hover {

    @Test
    public void hovering_Test(){
        //TC #3: Hover Test
        //1. Go to https://practice.cydeo.com/hovers
        Driver.getDriver().get("https://practice.cydeo.com/hovers ");

        //Locate all the images under here:
        WebElement img1 = Driver.getDriver().findElement(By.xpath("//img)[1]"));
        WebElement img2 = Driver.getDriver().findElement(By.xpath("//img)[2]"));
        WebElement img3 = Driver.getDriver().findElement(By.xpath("//img)[3]"));

        //2. Hover over to first image



        //3. Assert:
        //a. “name: user1” is displayed
        //b. “view profile” is displayed 4. Hover over to second image
        //5. Assert:
        //a. “name: user2” is displayed
        //b. “view profile” is displayed 6. Hover over to third image
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
