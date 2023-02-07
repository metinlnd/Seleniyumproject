package com.cydeo.tests.day10_upload_actions_executor;

import com.cydeo.utility.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class T6_jAVASCRIPTeCEUTER
{
    @Test

    public void javascript_executer_test1(){


        Driver.getDriver().get("https://practice.cydeo.com/infinite_scroll");

       // ((JavascriptExecutor)Driver.getDriver()).executeScript("");
        //use javascript methot to scroll

        JavascriptExecutor js= (JavascriptExecutor)Driver.getDriver();

        js.executeScript("window.scrollBy(0,1750)");

















    }








}
