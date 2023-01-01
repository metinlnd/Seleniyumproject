package com.cydeo.tests.day3_css;

import com.cydeo.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_CSS_LOCATORS {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://login1.nextbasecrm.com/");

        WebElement passwordActualBotton = driver.findElement(By.cssSelector("input[ type='submit']"));
        WebElement loginBotton = driver.findElement(By.cssSelector("input[class='login-inp"));

        loginBotton.sendKeys("metin");

        passwordActualBotton.click();
    }
}


