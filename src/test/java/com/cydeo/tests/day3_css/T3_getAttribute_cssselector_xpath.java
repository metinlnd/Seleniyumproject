package com.cydeo.tests.day3_css;

import com.cydeo.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getAttribute_cssselector_xpath {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://login1.nextbasecrm.com/");

        WebElement singinBottom = driver.findElement(By.cssSelector("input[value='Log In']"));




        String expectedButtonText= "Log In";
        String actualButtonResult=singinBottom.getAttribute("value");

        System.out.println(actualButtonResult);


    }
}
