package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicControlsPage {
    public DynamicControlsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //@FindBy(xpath = "//button[@type='button']")
    //@FindBy(xpath = "//button[.='Remove']")  xpath:text
    @FindBy(css = "form#checkbox-example>button") // id
    public WebElement removeButton;

    @FindBy(css = "div#=loading")
    public WebElement loadingBar;

    //@FindBy(css = "input[label='blah']")
    @FindBy(css = "input[type='checkbox']")
    public WebElement checkBox;

    @FindBy(css = "p[id='message']")
    public WebElement message;


}

