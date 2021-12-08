package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewSystemUsersPage extends Utility {
    @FindBy(xpath = "//a[contains(text(),'>')]")
    WebElement systemUserstxt;

    @FindBy(xpath = "//input[@id='searchSystemUser_userName']")
    WebElement userField;

    @FindBy(xpath = "//select[@id='searchSystemUser_userType']")
    WebElement userRollDropDown;

    @FindBy(xpath = "//input[@id='systemUser_employeeName_empName']")
    WebElement employeeName;

    @FindBy(xpath = "//select[@id='searchSystemUser_status']")
    WebElement statusDropDown;

    @FindBy(xpath = "//input[@id='searchBtn']")
    WebElement searchBtn;

    @FindBy(xpath = "//input[@id='btnAdd']")
    WebElement addBtn;

    @FindBy(xpath = "//input[@id='btnDelete']")
    WebElement deleteBtn;

    @FindBy(xpath ="//input[@id='btnDelete']" )
    WebElement resetbtn;

    public String selectOnSystemUserTxt() {
        return getTextFromElement(systemUserstxt);

    }

    public void sendtxtONUserNameField(String username) {
        sendTextToElement(userField, username);
    }

    public void selectUserDrpDown(String rollvalue) {
        selectByValueFromDropDown(userRollDropDown, rollvalue);
    }

    public void sendtotxtEmployeeName(String empname) {
        sendTextToElement(employeeName, empname);
    }
    public void selectValueStatusDropDown(String status){
        selectByValueFromDropDown(statusDropDown,status);


    }public void addButton(){
        clickOnElement(addBtn);
    }

    public void setDeleteBtn(){
        clickOnElement(deleteBtn);
    }
    public void restBtn(){
        clickOnElement(resetbtn);
    }

    public void clickOnSearchBtn(){
        clickOnElement(searchBtn);
    }
}
