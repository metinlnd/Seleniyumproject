package com.cydeo.tests.day2_locators_getTest_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_LibraryLoginPage {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://library2.cybertekschool.com");

        WebElement usernameInput= driver.findElement(By.className("form-control"));

        usernameInput.sendKeys("incorrect@gmail.com");


        WebElement passwordInput=driver.findElement(By.id("inputPassword"));
        passwordInput.sendKeys("514242");

        WebElement signInBottom=driver.findElement(By.tagName("button"));

        signInBottom.click();
      String a=  signInBottom.getTagName();
        System.out.println(a);















    }
}
