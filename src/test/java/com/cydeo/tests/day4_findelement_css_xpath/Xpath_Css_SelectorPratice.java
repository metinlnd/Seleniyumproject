package com.cydeo.tests.day4_findelement_css_xpath;

import com.cydeo.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Xpath_Css_SelectorPratice {
    public static void main(String[] args) {

    WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/forgot_password");


  WebElement homelink3= driver.findElement(By.cssSelector("a[class='nav-link']"));
    WebElement homelink4=  driver.findElement(By.cssSelector("a.nav-link"));
 WebElement homelink5=driver.findElement(By.cssSelector("a[href='/']"));


WebElement homelink6= driver.findElement(By.cssSelector("div.example>h2"));


WebElement homelink8= driver.findElement(By.xpath("//label[@for='email']"));

WebElement homelink9= driver.findElement(By.xpath("//input[@name='email']"));

//WebElement homelink10= driver.findElement(By.xpath(""));


        System.out.println(homelink6.isDisplayed());
    }
}
