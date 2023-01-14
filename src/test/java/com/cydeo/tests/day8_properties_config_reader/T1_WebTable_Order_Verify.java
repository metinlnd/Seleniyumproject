package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.utility.WebDriverFactory;
import com.cydeo.utility.WebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_WebTable_Order_Verify {
   public WebDriver driver;



    @BeforeTest
    public void setupMetod(){

      driver= WebDriverFactory.getDriver("chrome");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

       driver.get("https://practice.cydeo.com/web-tables");
    }




    @Test
    public void order_name_verify_test(){

        WebElement bobMartinElement= driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr[7]/td[.='Bob Martin']"));

        System.out.println(bobMartinElement.getText());

String expectedbobName="Bob Martin";
String actualBObname= bobMartinElement.getText();

        Assert.assertEquals(expectedbobName,actualBObname);

 WebElement bobMartindataCell= driver.findElement(By.xpath("//table[@class='SampleTable']//td[.='Bob Martin']/following-sibling::td[3]"));
String expectedBobdate= "12/31/2021";
String actualBobdate= bobMartindataCell.getText();
Assert.assertEquals(actualBobdate,expectedBobdate);

    }

   //we use utility method we created
    @Test
    public void Test2(){

    String costomerOrderDate= WebTableUtils.returnOrderDate(driver,"Alexandra Gray");
        System.out.println(costomerOrderDate);

    }




@Test
    public void Test3(){

WebTableUtils.orderVerify(driver,"Bart Fisher","01/16/2021");



}














}
