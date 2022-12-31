package com.cydeo.tests.day2_locators_getTest_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearch {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        WebElement googleSearchBox= driver.findElement(By.name("q"));

          Thread.sleep(5000);
        googleSearchBox.sendKeys("apple"+ Keys.ENTER);
String expectedingTitle= "apple";



String actualTitle=driver.getTitle();
        System.out.println(actualTitle);
if(expectedingTitle.startsWith(actualTitle)){
    System.out.println("passed");
}else {
    System.out.println("failed");
}












    }
}
