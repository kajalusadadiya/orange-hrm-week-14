package com.orangehrmlive.demo.pages;

import com.aventstack.extentreports.Status;
import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility {


    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='txtUsername']")
    WebElement userNameField;
    @FindBy(xpath = "//input[@id='txtPassword']")
    WebElement passwordField;

    @FindBy(xpath = "//input[@id='btnLogin']")
    WebElement loginBtn;

    @FindBy(xpath = "//div[@id='logInPanelHeading']")
    WebElement loginPanel;

    @FindBy(xpath = "//a[@id='welcome']" )
    WebElement wellcomeMsg;

    @FindBy(css = "img[alt='OrangeHRM']")
    WebElement logoMsg;

    @FindBy(xpath = "//a[@id='welcome']")
    WebElement profileLogo;

    @FindBy(xpath = "//a[contains(text(),'Logout')]")
    WebElement logOut;

    @FindBy(xpath = "//input[@id='dialogDeleteBtn']")
    WebElement popup;


    public void enterUserNameField(String Username) {
        sendTextToElement(userNameField, Username);
        CustomListeners.test.log(Status.PASS, "Enter Username" + Username);
    }

    public void enterPasswordField(String Password) {
        sendTextToElement(passwordField, Password);
        CustomListeners.test.log(Status.PASS, "Enter Password" + Password);
    }

    public void clickOnLoginBtn() {
        clickOnElement(loginBtn);
        CustomListeners.test.log(Status.PASS, "click on login button");
    }

    public String verifyLoginPanel() {
        return getTextFromElement(loginPanel);

    }
    public String verifyWellComeMsg(){
        return getTextFromElement(wellcomeMsg);

    }
    public String verifyLogo(){
        return getTextFromElement(logoMsg);
    }
    public void clickOnProfileLogo(){
        clickOnElement(profileLogo);

    }
    public void mouseoverandClickOnLogOut(){
        mouseHoverToElementAndClick(logOut);
    }

    public void acceptPopUP(){
        clickOnElement(popup);

    }
}
