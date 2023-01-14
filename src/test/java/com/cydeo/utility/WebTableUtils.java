package com.cydeo.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WebTableUtils {

    public static String returnOrderDate(WebDriver driver, String costumerName){


        String locator= "//table[@class='SampleTable']//td[.='"+costumerName+"']/following-sibling::td[3]";

        WebElement customerDateCell= driver.findElement(By.xpath(locator));
        return customerDateCell.getText();





    }


    public static void orderVerify(WebDriver driver, String customerName, String expectdOrderDate){



        String locator= "//table[@class='SampleTable']//td[.='"+customerName+"']/following-sibling::td[3]";

        WebElement customerDateCell= driver.findElement(By.xpath(locator));

        String actualOrderDate= customerDateCell.getText();

        Assert.assertEquals(actualOrderDate,expectdOrderDate);


    }









}
