package com.cydeo.tests.day5_testNG_INTRO_DROPDOWND;

import com.cydeo.utility.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNg_Selenium {

    private String message;
    WebDriver driver;
    @BeforeMethod
   public void setupMETHOD(){
        WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @AfterMethod

    public void teardown(){
        driver.close();
        //driver.quit();

    }

    @Test
    public void selenium_test(){


    driver.get("https://google.com");

String actualtitle=driver.getTitle();
String expectedTitle="Google";

        Assert.assertEquals(actualtitle,expectedTitle,"title is not matching");





    }



}
