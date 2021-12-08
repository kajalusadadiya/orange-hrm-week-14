package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPage extends Utility {
    @FindBy(xpath = "//a[@id='menu_admin_UserManagement']")
    WebElement userManagement;

    @FindBy(xpath = "//a[@id='menu_admin_Job']")
    WebElement adminJob;

    @FindBy(xpath = "//a[@id='menu_admin_Organization']")
    WebElement Organization;

    @FindBy(xpath = "//input[@id='ohrmList_chkSelectRecord_63']")
    WebElement checkBox;

    public void clickOnUserManagement() {
        clickOnElement(userManagement);
    }

    public void clickOnJob() {
        clickOnElement(adminJob);
    }

    public void clickOnOrganization() {
        clickOnElement(Organization);

    }public void clickOncheckBox(){
        clickOnElement(checkBox);
    }
}
