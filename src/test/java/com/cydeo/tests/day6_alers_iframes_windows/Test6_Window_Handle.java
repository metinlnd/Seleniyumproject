package com.cydeo.tests.day6_alers_iframes_windows;

import com.cydeo.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Test6_Window_Handle {

    WebDriver driver;


    @BeforeMethod

    public void setUpmETOD() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/windows");


    }

    @Test
    public void mutltipleWindowTest(){
        String mainHandle= driver.getWindowHandle();

        System.out.println(mainHandle);

        String expectedtitle="Windows";
        String actualtitle= driver.getTitle();

        Assert.assertEquals(actualtitle,expectedtitle);

        WebElement clickherebuttons=driver.findElement(By.xpath("//a[@target=  '_blank']"));
        clickherebuttons.click();

        for(String each: driver.getWindowHandles()){
            driver.switchTo().window(each);

            System.out.println("currnet windot"+driver.getTitle());
        }

    }



}
