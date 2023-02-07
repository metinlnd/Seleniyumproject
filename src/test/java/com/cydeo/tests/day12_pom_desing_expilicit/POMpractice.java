package com.cydeo.tests.day12_pom_desing_expilicit;

import com.cydeo.Pages.LibraryLoginPage;
import com.cydeo.utility.Driver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class POMpractice {

    LibraryLoginPage libraryLoginPage;
@BeforeMethod
public void setuPmETOD(){
    Driver.getDriver().get("https://library1.cydeo.com/");
    libraryLoginPage=new LibraryLoginPage();

}

    @Test
    public void required_field_error_message_test() {

        libraryLoginPage.signInButton.click();


        Assert.assertTrue(libraryLoginPage.fieldrRequirederrorMessage.isDisplayed());
Driver.closeDriver();
    }

@Test
public void invalid_email_format_error_message_test(){

    libraryLoginPage.inputUsername.sendKeys("sometingworng");

  libraryLoginPage.signInButton.click();


  Assert.assertTrue(libraryLoginPage.wrongEmailOrPasswordErrorMessage.isDisplayed());
Driver.closeDriver();
}

@Test
    public void library_negative_login_test(){





        libraryLoginPage.inputUsername.sendKeys("wrong@username");
        libraryLoginPage.inputPassword.sendKeys("wrongpassword");
        libraryLoginPage.signInButton.click();

      //  Assert.assertTrue(libraryLoginPage.wrongEmailOrPasswordErrorMessage.isDisplayed());








}











}
