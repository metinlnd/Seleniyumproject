package com.cydeo.tests.SeleniyumReiew;

import com.cydeo.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class xpathanccss {

    public WebDriver driver;


    @BeforeTest
    public void beforetest(){
        driver=WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/add_remove_elements/");





    }


    @Test
    public void test1(){
        WebElement addElementbuttom= driver.findElement(By.xpath("//button [@onclick='addElement()']"));


    }

    @AfterTest
    public void aftertest2(){
        driver.close();
    }

}
