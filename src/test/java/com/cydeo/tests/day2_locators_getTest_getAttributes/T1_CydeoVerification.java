package com.cydeo.tests.day2_locators_getTest_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerification {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();
       // driver.get("https://practice.cydeo.com");
        driver.navigate().to("https://practice.cydeo.com");

        String expectedURL="cydeo";

        String actualURL= driver.getCurrentUrl();

         if(actualURL.contains(expectedURL)){
             System.out.println("URL VERIFICATION PASSED");
         }else {
             System.out.println("URL VERIFICATION FAILED");
         }



         String expectedTitle=" Practice";

         String actualTitle=driver.getTitle();

         if(expectedTitle.equals(actualTitle)){
             System.out.println("tittle verification passed");
         }else {
             System.out.println("failed");
         }

         driver.close();



































    }
}
