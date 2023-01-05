package com.cydeo.tests.day5_testNG_INTRO_DROPDOWND;

import com.cydeo.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T2_RadioBottom {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/radio_buttons");


        WebElement HockeyradioButtons= driver.findElement(By.xpath("(//label[@class='form-check-label'])[8]"));
HockeyradioButtons.click();
 System.out.println(HockeyradioButtons.isDisplayed());;
 System.out.println(HockeyradioButtons.isSelected());


        List<WebElement> radiolist = driver.findElements(By.className("radio"));
        System.out.print(radiolist);

 System.out.println(radiolist.size());
        for (WebElement each : radiolist) {

             System.out.println(each.getText());

        }



















    }
}
