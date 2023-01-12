package com.cydeo.tests.day6_alers_iframes_windows;

import com.cydeo.utility.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_Alert_Practice {


    WebDriver driver;

    @BeforeMethod
    public void setUpmETOD(){

       driver= WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }


    @Test
    public void alertPracticeTest1(){

        driver.get("https://practice.cydeo.com/javascript_alerts");

        WebElement informatinAlerButton= driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        informatinAlerButton.click();

        Alert alert= driver.switchTo().alert();

        alert.accept();

        WebElement resultText= driver.findElement(By.xpath("//p[@id='result']"));

String expectedtext="You successfully clicked an alert";
String actualtext= resultText.getText();
Assert.assertEquals(expectedtext,actualtext);

    }


    @AfterMethod
    public void aftermetod(){

       // driver.close();
    }






}
