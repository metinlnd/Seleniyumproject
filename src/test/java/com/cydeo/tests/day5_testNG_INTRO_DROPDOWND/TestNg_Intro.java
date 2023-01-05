package com.cydeo.tests.day5_testNG_INTRO_DROPDOWND;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg_Intro {
    @BeforeMethod
    public void setupMetod(){
        System.out.println("beforemetod is running");
    }

    @Test
    public void test1(){
        System.out.println("tst 1 running");


    }

@Test
public void Test2(){
    System.out.println("test2 is runnig");
}









}
