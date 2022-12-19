package com.cydeo.tests.day2_locators_getTest_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_LinkTextPractice {
    public static void main(String[] args) {

        WebDriverManager.chromiumdriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com");

        //driver.findElement(By.linkText("A/B Testing")).click();


        WebElement abTestlink=driver.findElement(By.linkText("A/B Testing"));

        abTestlink.click();


        String expectedTitle="A/B Testing";

        String actualTitle=driver.getTitle();
        System.out.println(actualTitle);
        if(actualTitle.equals(expectedTitle)){
            System.out.println("passed");
        }else {
            System.out.println("failed");
        }

        driver.navigate().back();


        String expectedTitle2="Practice";
        actualTitle=driver.getTitle();

        if(actualTitle.equals(expectedTitle2)){
            System.out.println("passed");
        }else {
            System.out.println("failed too");
        }







    }
}
