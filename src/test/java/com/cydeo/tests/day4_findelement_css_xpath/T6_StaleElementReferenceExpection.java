package com.cydeo.tests.day4_findelement_css_xpath;

import com.cydeo.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T6_StaleElementReferenceExpection {
    public static void main(String[] args) {


        WebDriver driver=WebDriverFactory.getDriver("chrome");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("https://practice.cydeo.com/abtest");

        WebElement cydeolink= driver.findElement(By.xpath("//a[@target='_blank']"));


        System.out.println(cydeolink.isDisplayed());

        //refresh the page

        driver.navigate().refresh();// RELOCATE HAS TO BE
       cydeolink= driver.findElement(By.xpath("//a[@target='_blank']"));

        System.out.println(cydeolink.isDisplayed());






    }
}
