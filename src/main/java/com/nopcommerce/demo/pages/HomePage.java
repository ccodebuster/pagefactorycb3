package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    By loginLink = By.linkText("Log in");


    By registerLink = By.linkText("Register");



    public void clickOnLoginLink() {
        log.info("clicking on login link : "+  loginLink.toString());
        clickOnElement(loginLink);

    }

    public void clickOnRegisterLink() {
        log.info("click on register link :"+registerLink.toString());
        clickOnElement(registerLink);

    }


}
