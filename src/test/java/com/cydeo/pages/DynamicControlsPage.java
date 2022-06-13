package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class DynamicControlsPage {
    public DynamicControlsPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

}
/*
TC #1: Double Click Test 1. Goto
https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblcli
ck2
2. Switch to iframe.
3. Double click on the text“Double-click me to change mytext color.”
4. Assert:Text’s“style”attribute value contains“red”.
NOTE: FOLLOW POM
 */
