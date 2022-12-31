package com.cydeo.tests.day3_css;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_locators_getText {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://login1.nextbasecrm.com/");

       // driver.get("https://login2.nextbasecrm.com/");

        WebElement inputUsurname = driver.findElement(By.className("login-inp"));

            inputUsurname.sendKeys("metin");

        WebElement inputPassword = driver.findElement(By.name("USER_PASSWORD"));

    inputPassword.sendKeys("ksdkdk");

        WebElement errorMessage = driver.findElement(By.className("errortext"));

String expectedErrorMessage= "Incorrect login or password";

String actualerrormessage=errorMessage.getText();

if(actualerrormessage.equals(expectedErrorMessage)){
    System.out.println("error message passed");
}else {
    System.out.println("error message failed");
}




    }
}
