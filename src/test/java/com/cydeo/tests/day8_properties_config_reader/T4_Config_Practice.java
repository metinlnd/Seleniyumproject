package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.utility.ConfigurationReader;
import com.cydeo.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_Config_Practice {

    public WebDriver driver;

    @BeforeMethod
    public void setup(){


        String browserType= ConfigurationReader.getProperty("browser");


        driver= WebDriverFactory.getDriver(browserType);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://google.com");
    }



    @Test

    public void google_search(){

        WebElement googleseacrhbox= driver.findElement(By.xpath("//input[@name='q']"));

        WebElement rejectall=driver.findElement(By.xpath("//div[@class='QS5gu sy4vM']"));
        rejectall.click();
        googleseacrhbox.sendKeys("apple"+ Keys.ENTER);

String expectedTitle="apple - Google Search";

String actualTitle=driver.getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);

    }

}
