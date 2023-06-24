package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());


    public LoginPage(){
        PageFactory.initElements(driver,this);
    }


    By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");


    By emailField = By.id("Email");


    By passwordField = By.name("Password");


    By loginButton = By.xpath("//button[contains(text(),'Log in')]");


    By errorMessage = By.xpath("//div[@class='message-error validation-summary-errors']");

    public String getWelcomeText() {
        log.info("getting text from : "+welcomeText.toString());
        return getTextFromElement(welcomeText);
    }

    public void enterEmailId(String email) {
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public String getErrorMessage() {
        return getTextFromElement(errorMessage);
    }
}
