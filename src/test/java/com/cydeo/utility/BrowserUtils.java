package com.cydeo.utility;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

/* in this class only genereal utility methots that are not related to some specific page*/
public class BrowserUtils {

    /* this metod will accept int second and execute Thread.sleep for given duration time*/

    public static  void sleep(int second){

        second*=1000;

        try {
            Thread.sleep(second);

        }catch (InterruptedException e){}


    }


    public static void switchWindowAndVerify(WebDriver driver, String expectedinURL, String expectedTitle){
        Set<String> allWindows=driver.getWindowHandles();

        for (String each : allWindows) {

            driver.switchTo().window(each);
            System.out.println("current url"+ driver.getCurrentUrl());

            if(driver.getCurrentUrl().contains(expectedinURL)){break;}



        }

        String accualtitle= driver.getTitle();

        Assert.assertTrue(accualtitle.contains(expectedTitle));

    }

    /*This metod accept string "expectedTitle" and aSSERT if its true*/

public  static  void verifyTitle(WebDriver driver,String expectedTitle){
    Assert.assertEquals(driver.getTitle(),expectedTitle);


}

    }



