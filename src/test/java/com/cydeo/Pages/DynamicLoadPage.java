package com.cydeo.Pages;

import com.cydeo.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoadPage {

    public DynamicLoadPage(){
        PageFactory.initElements(Driver.getDriver(), this);}


   @FindBy(xpath = "//strong[.='Done!']")
    public WebElement donemessage;





    @FindBy(xpath = "//img[@alt='square pants']")
    public WebElement squarepantsImage;






}
