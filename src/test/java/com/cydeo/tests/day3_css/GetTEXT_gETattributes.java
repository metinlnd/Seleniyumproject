package com.cydeo.tests.day3_css;

import com.cydeo.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetTEXT_gETattributes {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.navigate().to("https://login1.nextbasecrm.com");

        WebElement rememberMelaber=driver.findElement(By.className("login-item-checkbox-label"));

        String expectedRemembermeLabel="Remember me on this computer";
        String actualRememberMeLabel= rememberMelaber.getText();

 if(actualRememberMeLabel.equals(expectedRemembermeLabel)){
     System.out.println("label verificatin passed");
 }else {
     System.out.println("label verification failed");
 }


        WebElement forgotPasswordLinkText = driver.findElement(By.className("login-link-forgot-pass"));
String expectedForgotPsswordlINKTEXT="forgot your password?";
String actualForgotPasswordLinkTect=forgotPasswordLinkText.getText();

if(expectedForgotPsswordlINKTEXT.equals(actualForgotPasswordLinkTect)){
    System.out.println("passed");

}else {
    System.out.println("failed");
}


String expectedInHref="forgot_password=yes";
String actualAttrubuteValue=forgotPasswordLinkText.getAttribute("href");

if(expectedForgotPsswordlINKTEXT.equals(actualAttrubuteValue)){
    System.out.println("passed");
}else {
    System.out.println("failed");
}










    }
}
