package com.cydeo.tests.day7_WindowHandling;

import com.cydeo.utility.BrowserUtils;
import com.cydeo.utility.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_WindowHandling {
    WebDriver driver;

    @BeforeMethod
    public void setupMetod(){

        driver=  WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test

    public void windowHANLINGtEST(){
        driver.get("https://www.amazon.com");
        //3. Copy-paste the lines from below into your class
        ((JavascriptExecutor) driver).executeScript("window.open('https://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://facebook.com','_blank');");



        BrowserUtils.switchWindowAndVerify(driver,"etsy","Etsy");



    }



}
