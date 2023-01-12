package com.cydeo.tests.day6_alers_iframes_windows;

import com.cydeo.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownPractice {
    WebDriver driver;


    @BeforeMethod
    public void setupMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");
}

    @Test
    public void dropDown(){

        Select statedropdownbottom= new Select(driver.findElement(By.xpath("//select[@id='state']")));

      statedropdownbottom.selectByVisibleText("Illinois");
      statedropdownbottom.selectByValue("VA");
      statedropdownbottom.selectByIndex(5);
String expectedOption="California";
String actualOptionText=statedropdownbottom.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOptionText,expectedOption);

    }

    @Test
    public void droprownTest2(){
        Select yearDropdown= new Select(driver.findElement(By.xpath("//select[@id='year']")));

        Select monthDropdown= new Select(driver.findElement(By.xpath("//select[@id='month']")));

        Select dayDropdown= new Select(driver.findElement(By.xpath("//select[@id='day']")));

       // yearDropdown.selectByVisibleText("1923");

        monthDropdown.selectByValue("11");

        dayDropdown.selectByIndex(0);

        String expectedyear="1923";
        String expectedmonth="December";
        String expectedday="1";
        String actualyear=yearDropdown.getFirstSelectedOption().getText();
        String actualmonth=monthDropdown.getFirstSelectedOption().getText();
        String actalday= yearDropdown.getFirstSelectedOption().getText();


       // Assert.assertTrue(actualyear.equals(expectedyear));
        Assert.assertEquals(actualmonth,expectedday);
Assert.assertEquals(actalday,expectedday);
    }


@AfterMethod
    public void teardonw(){

        driver.close();
}


}
