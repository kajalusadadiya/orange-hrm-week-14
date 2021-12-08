package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.*;
import com.orangehrmlive.demo.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UsersTest extends TestBase {
    LoginPage loginpage;
    AddUserPage addUserPage;
    DashboardPage dashBoard;
    HomePage homePage;
    ViewSystemUsersPage viewSystemUsersPage;
    AdminPage adminPage;


    @BeforeMethod
    public void inIt() {
        loginpage = new LoginPage();
        addUserPage = new AddUserPage();
        dashBoard = new DashboardPage();
        homePage = new HomePage();
        viewSystemUsersPage = new ViewSystemUsersPage();
        adminPage = new AdminPage();

    }

    @Test(groups = {"sanity", "regression"})

    public void adminShouldAddUserSuccessFully() {

        loginpage.enterUserNameField("Admin");

        loginpage.enterPasswordField("admin123");
        loginpage.clickOnLoginBtn();
        homePage.clickOnAdmin();

        //***two veriications are pending****

        viewSystemUsersPage.addButton();
        viewSystemUsersPage.selectUserDrpDown("Admin");
        viewSystemUsersPage.sendtotxtEmployeeName("Ananya Dash");
        viewSystemUsersPage.sendtxtONUserNameField("Ananyad");
        viewSystemUsersPage.selectValueStatusDropDown("Disable");
        addUserPage.enterPassword("sairam123");
        addUserPage.enterConfirmPassword("sairam123");
        addUserPage.clickOnSave();

//***verify msg**


    }

    @Test(groups = {"sanity", "regression"})

    public void searchTheUserCreatedAndVerifyIt() {
        loginpage.enterUserNameField("Admin");

        loginpage.enterPasswordField("admin123");
        loginpage.clickOnLoginBtn();
        homePage.clickOnAdmin();

        addUserPage.EnterUserName("Ananyad");
        addUserPage.selectOnUserRoleDropDown("Admin");
        viewSystemUsersPage.selectValueStatusDropDown("");
        viewSystemUsersPage.clickOnSearchBtn();
        //****need to verify***


    }

    @Test(groups = {"sanity", "regression"})

    public void verifyThatAdminShouldDeleteTheUserSuccessFully() {
        loginpage.enterUserNameField("Admin");

        loginpage.enterPasswordField("admin123");
        loginpage.clickOnLoginBtn();
        homePage.clickOnAdmin();
        addUserPage.EnterUserName("Ananyad");
        addUserPage.selectOnUserRoleDropDown("Admin");
        viewSystemUsersPage.selectValueStatusDropDown("");
        viewSystemUsersPage.clickOnSearchBtn();
        adminPage.clickOncheckBox();
        viewSystemUsersPage.setDeleteBtn();
        loginpage.acceptPopUP();


    } @Test(groups = {"sanity", "regression"})

    public void searchTheDeletedUserAndVerifyTheMessageNoRecordFound(){
        loginpage.enterUserNameField("Admin");

        loginpage.enterPasswordField("admin123");
        loginpage.clickOnLoginBtn();
        homePage.clickOnAdmin();
        addUserPage.EnterUserName("Ananyad");
        addUserPage.selectOnUserRoleDropDown("Admin");
        viewSystemUsersPage.selectValueStatusDropDown("");
        viewSystemUsersPage.clickOnSearchBtn();


    }
}
