package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {
    @FindBy(css = "img[alt='OrangeHRM']")
    WebElement logo;

    @FindBy(xpath = "//b[contains(text(),'Admin')]")
    WebElement admin;

    @FindBy(xpath = "//b[contains(text(),'PIM')]")
    WebElement pim;

    @FindBy(xpath = "//b[normalize-space()='Leave']")
    WebElement leave;

    @FindBy(xpath = "//b[normalize-space()='Dashboard']")
    WebElement dashboard;

    @FindBy(xpath = "//a[@id='welcome']")
    WebElement welcometxt;

    public String verifyOrangHrm() {
        return getTextFromElement(logo);
    }

    public void clickOnAdmin() {
        clickOnElement(admin);
    }


    public void clickOnPim() {
        clickOnElement(pim);


    }

    public void clickOnLeave() {
        clickOnElement(leave);
    }

    public void clickOnDashBorad() {
        clickOnElement(dashboard);

    }

    public String verifyWelcometxt() {
        return getTextFromElement(welcometxt);
    }
}
