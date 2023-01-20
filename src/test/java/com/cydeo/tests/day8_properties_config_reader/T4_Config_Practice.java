package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T4_Config_Practice {
/*
    public WebDriver driver;

    @BeforeMethod
    public void setup(){


        String browserType= ConfigurationReader.getProperty("browser");


        driver= WebDriverFactory.getDriver(browserType);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

*/

    @Test

    public void google_search(){
      Driver.getDriver().get("https://google.com");
        WebElement googleseacrhbox=  Driver.getDriver().findElement(By.xpath("//input[@name='q']"));

        WebElement rejectall= Driver.getDriver().findElement(By.xpath("//div[@class='QS5gu sy4vM']"));
        rejectall.click();
        googleseacrhbox.sendKeys("apple"+ Keys.ENTER);

String expectedTitle="apple - Google Search";

String actualTitle= Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);

    }

}
