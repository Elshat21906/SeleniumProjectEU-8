package com.cydeo.tests.day5_Testing_Intro_DropDowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {
    @Test (priority = 1)// yellow means it can run without main method -- imported
    public void test1(){
        System.out.println(" Test 1 is running ...");

        // //ASSERT EQUALS: compare 2 of the same things
               String actual = "apple";
               String expected = "apple";
        Assert.assertEquals(actual,expected);
    }


    @Test (priority = 2)
    public void test2(){
        System.out.println(" Test 2 is running ...");

        // AssertTrue
        String actual = "apple";
        String expected = "apple";
        Assert.assertTrue(actual.equals(expected));
    }



    @BeforeClass
    public void setupMethod(){
        System.out.println(" ---> Before Class is running ");
    }

    @AfterClass
    public void tearDownClass(){
        System.out.println(" ---> After Class is running");
    }

    @BeforeMethod
    public void setUpMethod(){
        System.out.println(" ---> Before Method is running ... ");
    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println(" ---> After Method is running ...");
    }

}
