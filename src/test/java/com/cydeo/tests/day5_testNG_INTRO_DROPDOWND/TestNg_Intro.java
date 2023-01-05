package com.cydeo.tests.day5_testNG_INTRO_DROPDOWND;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg_Intro {

    @BeforeClass
    public void setupMethot(){
        System.out.println("--------before class is running");
    }

    @BeforeMethod
    public void setupMetod(){
        System.out.println("beforemetod is running");
    }


@AfterMethod
public void afterMetod(){
    System.out.println("aftermetod is runing");
}


    @Test
    public void test1(){
        System.out.println("tst 1 running");
        String actual="ap";
        String expected="ap1";
        System.out.println("==========");
        Assert.assertEquals(actual,expected);

    }




@Test(priority=2)
public void Test2(){
    System.out.println("test2 is runnig");

    String actual="ap2";
    String expected="ap2";


    Assert.assertTrue(actual.equals(expected));
}









}
