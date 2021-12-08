package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddUserPage extends Utility {
    @FindBy(xpath = "//select[@id='systemUser_userType']")
    WebElement userrolldropdown;

    @FindBy(xpath = "//input[@id='systemUser_employeeName_empName']")
    WebElement employeeName;

    @FindBy(xpath = "//input[@id='systemUser_userName']")
    WebElement username;

    @FindBy(xpath = "//select[@id='systemUser_status']")
    WebElement statusDropdown;

    @FindBy(xpath = "//input[@id='systemUser_password']")
    WebElement password;

    @FindBy(xpath = "//input[@id='systemUser_password']")
    WebElement confirmedPassword;

    @FindBy(xpath = "//input[@id='btnSave']")
    WebElement saveBTN;

    @FindBy(xpath = "//input[@id='btnCancel']")
    WebElement cancelBtn;

    public void selectOnUserRoleDropDown(String rollvalue) {
        selectByValueFromDropDown(userrolldropdown, rollvalue);
    }

    public void enterOnEmpName(String name) {
        sendTextToElement(employeeName, name);
    }
    public void EnterUserName(String Username) {
        sendTextToElement(username, Username);
    }
    public void selectStatusDropdown(String value) {
        selectByValueFromDropDown(statusDropdown, value);
    }
    public void enterPassword(String Password) {
        sendTextToElement(password, Password);
    }
    public void enterConfirmPassword(String confirmPassword) {
        sendTextToElement(confirmedPassword, confirmPassword);
    }
    public void clickOnSave() {
        clickOnElement(saveBTN);}
    public void clickOnCancel(){
        clickOnElement(cancelBtn);
    }
}
