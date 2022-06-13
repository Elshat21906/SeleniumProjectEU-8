package com.cydeo.tests.day13_review_and_practices;

import com.cydeo.pages.DoubleClickPage;
import com.cydeo.utilities.Driver;
import org.testng.annotations.Test;

public class T1_DoubleClick {

    @Test
    public void t1_double_click_test(){
        //TC #1: Double Click Test
        // 1. Goto
        //https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblcli
        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblcli");
        //ck2
        //2. Switch to iframe.
        Driver.getDriver().switchTo().frame("iframeResult");

        //3. Double-click on the text“Double-click me to change my text color.”
        DoubleClickPage doubleClickPage = new DoubleClickPage();
        doubleClickPage.textTODoubleClick.click();

        //4. Assert:Text’s“style” attribute value contains“red”.

        //NOTE: FOLLOW POM
    }
}
