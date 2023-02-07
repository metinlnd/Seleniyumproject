package com.cydeo.tests.day12_pom_desing_expilicit;

import com.cydeo.Pages.DynamicLoad1Page;
import com.cydeo.Pages.DynamicLoadPage;
import com.cydeo.utility.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebdriverWaitPractice {


    @Test
    public void dynamic_Load7_test() {

        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/7");


        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.titleIs("Dynamic title"));

        DynamicLoadPage dynamicLoadingPage = new DynamicLoadPage();


        Assert.assertTrue(dynamicLoadingPage.donemessage.isDisplayed());

    }


    @Test
    public void dynamic_Load1_test() {

        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/1");

        DynamicLoad1Page dynamicLoadingPage = new DynamicLoad1Page();

        dynamicLoadingPage.startButton.click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.invisibilityOf(dynamicLoadingPage.loadingbar));

        Assert.assertTrue(dynamicLoadingPage.inputusername.isDisplayed());

        dynamicLoadingPage.inputusername.sendKeys("tomsmith");

        dynamicLoadingPage.Inputpassword.sendKeys("123456");
        dynamicLoadingPage.SubmitButton.click();

        Assert.assertTrue(dynamicLoadingPage.errorMessage.isDisplayed());


    }
}