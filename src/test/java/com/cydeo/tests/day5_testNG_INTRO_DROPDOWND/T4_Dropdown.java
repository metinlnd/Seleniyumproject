package com.cydeo.tests.day5_testNG_INTRO_DROPDOWND;

import com.cydeo.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_Dropdown {
    WebDriver driver;

    @BeforeMethod
    public void setupMetod(){

       driver=   WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");


    }

    @Test
    public void simpledropdown(){

        Select simpleDropdown=new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        WebElement currentlySelectedOption = simpleDropdown.getFirstSelectedOption();
       String actualsimpleDropdowntext= currentlySelectedOption.getText();
String expectedDropdownText="Please select an option";
        System.out.println(actualsimpleDropdowntext);

        Assert.assertEquals(expectedDropdownText,actualsimpleDropdowntext);



        Select stateDropdown= new Select(driver.findElement(By.xpath("//select[@id='state']")));

        String expectedStateDropdown="Select a State";
        String actualStateDropdown=stateDropdown.getFirstSelectedOption().getText();
      // Assert.assertEquals(expectedDropdownText,actualStateDropdown);

       // stateDropdown.selectByValue("Alaska");

//Assert.fail();

    }










}
