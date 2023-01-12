package com.cydeo.tests.day6_alers_iframes_windows;

import com.cydeo.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T5_Iframeinfo {
    WebDriver driver;


    @BeforeMethod

    public void setUpmETOD() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }


    @Test
    public void IframeTest(){

        driver.get("https://practice.cydeo.com/iframe");

        driver.switchTo().frame("mce_0_ifr");
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);

        WebElement YourcontentGOEShere= driver.findElement(By.xpath("//p"));

        Assert.assertTrue(YourcontentGOEShere.isDisplayed());

        // to be able to verify the header we must swich to back to main HTML
        driver.switchTo().parentFrame();

        WebElement mainheader= driver.findElement(By.xpath("//h3"));

Assert.assertTrue(mainheader.isDisplayed());


    }

    @AfterMethod
    public void aftermetodw(){

    }


}