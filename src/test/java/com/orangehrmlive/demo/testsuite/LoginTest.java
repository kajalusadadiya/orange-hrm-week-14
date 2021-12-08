package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    LoginPage loginpage;

    @BeforeMethod
    public void inIt() {
        loginpage = new LoginPage();

    }

    @Test(groups = {"sanity","regression"})
    public void verifyUserShouldLoginSuccessFully() {

        String expectedAddedMsg = "LOGIN Panel";//assert for added cart
        String realAddedMsg = loginpage.verifyLoginPanel();
        Assert.assertEquals(realAddedMsg, expectedAddedMsg, "verification fail login panel");

        loginpage.enterUserNameField("Admin");

        loginpage.enterPasswordField("admin123");
        loginpage.clickOnLoginBtn();

        String expectedMsg = "Welcome Sophie";//wellcome msg with sopie or Paul
        String actualMsg = loginpage.verifyWellComeMsg();
        Assert.assertEquals(actualMsg, expectedMsg, "verification fail : Welcome Sophie");


    }

    @Test(groups = {"sanity","smoke", "regression"})
    public void VerifyThatTheLogoDisplayOnHomePage() {
        loginpage.enterUserNameField("Admin");

        loginpage.enterPasswordField("admin123");
        loginpage.clickOnLoginBtn();

        //  *****need to verify********

        // String expectedMsg = "OrangeHRM";//oranghrm logo
        //   String actualMsg = loginpage.verifyLogo();
        //   Assert.assertEquals(actualMsg, expectedMsg);
    }

    @Test(groups = {"smoke", "regression"})
    public void VerifyUserShouldLogOutSuccessFully() {
        loginpage.enterUserNameField("Admin");

        loginpage.enterPasswordField("admin123");
        loginpage.clickOnLoginBtn();

        loginpage.clickOnProfileLogo();
        loginpage.mouseoverandClickOnLogOut();

        String expectedAddedMsg = "LOGIN Panel";//
        String realAddedMsg = loginpage.verifyLoginPanel();
     Assert.assertEquals(realAddedMsg, expectedAddedMsg);


    }
}
