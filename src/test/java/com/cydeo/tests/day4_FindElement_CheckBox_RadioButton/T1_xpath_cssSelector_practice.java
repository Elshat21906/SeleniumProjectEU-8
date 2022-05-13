package com.cydeo.tests.day4_FindElement_CheckBox_RadioButton;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_cssSelector_practice {
    public static void main(String[] args) {


        // TC #1: XPATH and cssSelector Practices
        // syntax#2: tagName#idValue        #=id
        //           tagName.classValue     .=class

        //  1. Open Chrome browser
        WebDriver t1 = WebDriverFactory.getDriver("chrome");
        t1.manage().window().maximize();

        // 2. Go to https://practice.cydeo.com/forgot_password
        t1.get("https://practice.cydeo.com/forgot_password");

        // 3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)

        //a “Home” link
        // Locate homeLink using cssSelector,class value
        WebElement homeLink1_ex1 = t1.findElement(By.cssSelector("a[class='nav-link']"));

        // Locate homeLink using cssSelector syntax #2
        WebElement homeLink1_ex2 = t1.findElement(By.cssSelector("a.nav-link"));

        // Locate homeLink using cssSelector,href value
        WebElement homeLink1_ex3 = t1.findElement(By.cssSelector("a[href='/']"));


        //b. “Forgot password” header
        //Locate header using cssSelector: locate parent element and move down to h2
        WebElement ForgotPasswordHeader =  t1.findElement(By.cssSelector("div.example>h2"));

        // Locate header using xpath,using web elements text "Forgot Password"
        // WebElement header = t1.findElement(By.xpath("//h2[.='Forgot Password']"));
        WebElement header = t1.findElement(By.xpath("//h2[text()='Forgot Password']"));


        //c. “E-mail” text
        WebElement emailLabel = t1.findElement(By.xpath("//label[@for='email']"));

        //d. E-mail input box
        WebElement inputBox1 = t1.findElement(By.xpath("//input[@name='email']"));
        WebElement inputBox2 = t1.findElement(By.xpath("//input[@type='text']"));

        //Locate input using xpath contains method
        //tagName[contains(@attribute,'value')]
        WebElement inputBox3 = t1.findElement(By.xpath("//input[contains(@pattern,'[a-z')]"));

        //e. “Retrieve password” button f. “Powered by Cydeo text

        //4. Verify all web elements are displayed.
        // First solve the task with using cssSelector only. Try to create 2 different
        // cssSelector if possible
        // Then solve the task using XPATH only. Try to create 2 different XPATH locator if possible
    }
}

