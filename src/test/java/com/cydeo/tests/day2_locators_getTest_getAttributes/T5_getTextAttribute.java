package com.cydeo.tests.day2_locators_getTest_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_getTextAttribute {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/registration_form");

        WebElement headerText= driver.findElement(By.tagName("h2"));

        String expectedHedertext= "Registration form";

        String actualHeadertext= headerText.getText();
        if(actualHeadertext.equals(expectedHedertext)){
            System.out.println("passed");
        }else {
            System.out.println("failed");
        }


        WebElement firstNameInput=driver.findElement(By.name("firstname"));


        String expectedPlaceHolder= "first name";

        String actualPlaceHolder= firstNameInput.getAttribute("placeholder");

        if(expectedPlaceHolder.equals(actualPlaceHolder)){
            System.out.println("passed");
        }else {
            System.out.println("failed");
        }

        driver.close();





    }
}
